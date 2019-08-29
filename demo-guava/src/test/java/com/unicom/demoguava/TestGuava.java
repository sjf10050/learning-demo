package com.unicom.demoguava;

import com.google.common.util.concurrent.*;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class TestGuava {
    @Test
    public void should_run_future_tasks_in_parallel() throws Exception {
        ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
        ListenableFuture<?> task1 = service.submit(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("future task1 done.....");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        ListenableFuture<?> task2 = service.submit(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("future task2 done.....");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        System.out.println("main task done.....");
        Thread.sleep(3000);
    }

    @Test
    public void testCallback() {
        //将ExecutorService装饰成ListeningExecutorService
        ListeningExecutorService service = MoreExecutors.listeningDecorator(
                Executors.newCachedThreadPool());

        //通过异步的方式计算返回结果
        ListenableFuture<People> future = service.submit(() -> {
            System.out.println("call execute..");
            People people = new People();
            people.setId("001");
            people.setUsername("hhh");
            return people;
        });

        //有两种方法可以执行此Future并执行Future完成之后的回调函数
        future.addListener(() -> {  //该方法会在多线程运算完的时候,指定的Runnable参数传入的对象会被指定的Executor执行
            try {
                System.out.println("in A");
                System.out.println("A:" + future.get().toString());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }, service);

        future.addListener(new Runnable() {
            @Override
            public void run() {
                System.out.println("sjf   ");
            }
        }, service);

        //方法2
        Futures.addCallback(future, new FutureCallback<People>() {
            @Override
            public void onSuccess(@Nullable People result) {
                System.out.println("in B");
                System.out.println("B:" + result.getUsername());
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println(t.getMessage());
            }
        }, service);
    }


    @Test
    public void testAutoConstruct() {
        MyActor actor = new MyActor();
        actor.execute("hello");
    }

}

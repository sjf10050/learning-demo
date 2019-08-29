package com.unicom.alarmdemo;

import org.junit.Test;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

public class SortTest {

    public static void main(String[] args) {
//        int arrInt[] = new int[]{1, 4, 15, 2, 9, 10, 7, 3, 8};
//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(arrInt);


    }

    @Test
    public void testFunction() {
        Function<Integer, String> func = inputData -> {
            String resultMessage = "输入：" + inputData;
            return resultMessage;
        };
        System.out.println(func.apply(222));
    }

    @Test
    public void TestConsumer() {
        Consumer<String> consumer = p -> {
            System.out.println(p);
        };
        consumer.accept("good");
    }

    @Test
    public void testUUID() {
        UUID id = UUID.randomUUID();
        System.out.println(id.toString());
    }
}

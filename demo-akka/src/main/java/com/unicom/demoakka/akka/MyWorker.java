package com.unicom.demoakka.akka;

import akka.actor.Actor;
import akka.actor.ActorContext;
import akka.actor.ActorRef;
import akka.actor.SupervisorStrategy;
import scala.Option;
import scala.PartialFunction;
import scala.runtime.BoxedUnit;

public class MyWorker implements Actor {
    @Override
    public ActorContext context() {
        return null;
    }

    @Override
    public ActorRef self() {
        return null;
    }

    @Override
    public ActorRef sender() {
        return Actor.super.sender();
    }

    @Override
    public PartialFunction<Object, BoxedUnit> receive() {
        return null;
    }

    @Override
    public void aroundReceive(public PartialFunction<Object, BoxedUnit> receive, public Object msg) {
        Actor.super.aroundReceive(receive, msg);
    }

    @Override
    public void aroundPreStart() {
        Actor.super.aroundPreStart();
    }

    @Override
    public void aroundPostStop() {
        Actor.super.aroundPostStop();
    }

    @Override
    public void aroundPreRestart(public Throwable reason, public Option<Object> message) {
        Actor.super.aroundPreRestart(reason, message);
    }

    @Override
    public void aroundPostRestart(public Throwable reason) {
        Actor.super.aroundPostRestart(reason);
    }

    @Override
    public SupervisorStrategy supervisorStrategy() {
        return super.supervisorStrategy();
    }

    @Override
    public void preStart() throws Exception, Exception {
        Actor.super.preStart();
    }

    @Override
    public void postStop() throws Exception, Exception {
        super.postStop();
    }

    @Override
    public void preRestart(public Throwable reason, public Option<Object> message) throws Exception, Exception {
        super.preRestart(reason, message);
    }

    @Override
    public void postRestart(public Throwable reason) throws Exception, Exception {
        super.postRestart(reason);
    }

    @Override
    public void unhandled(public Object message) {
        super.unhandled(message);
    }
}

package com.zhe.leetcode.algorithms.easy;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1114.按序打印
 */
public class PrintBYOrderSolution {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread t1 = new Thread(() -> {
            System.out.println("first");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("second");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("third");
        });

        foo.first(t1);
        foo.second(t3);
        foo.third(t2);
    }
}

class Foo {

    public AtomicInteger flag = new AtomicInteger(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        flag.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (flag.get() != 1) {

        }
        printSecond.run();
        flag.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (flag.get() != 2) {

        }
        printThird.run();
        flag.incrementAndGet();
    }

}

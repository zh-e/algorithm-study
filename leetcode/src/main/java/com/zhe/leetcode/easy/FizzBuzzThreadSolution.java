package com.zhe.leetcode.easy;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.function.IntConsumer;

/**
 * 1195. 交替打印字符串
 */
public class FizzBuzzThreadSolution {

    private int n;

    private static CyclicBarrier barrier = new CyclicBarrier(4);

    public FizzBuzzThreadSolution(int n) {
        this.n = n;
    }

    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                printFizz.run();
            }
            try {
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                printBuzz.run();
            }
            try {
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                printFizzBuzz.run();
            }
            try {
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                printNumber.accept(i);
            }
            try {
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FizzBuzzThreadSolution fizzBuzzThreadSolution = new FizzBuzzThreadSolution(15);
        new Thread(() -> {
            try {
                fizzBuzzThreadSolution.fizz(() -> {
                    System.out.println("fizz");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzzThreadSolution.buzz(() -> {
                    System.out.println("buzz");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzzThreadSolution.fizzbuzz(() -> {
                    System.out.println("fizzbuzz");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzzThreadSolution.number(System.out::println);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }

}

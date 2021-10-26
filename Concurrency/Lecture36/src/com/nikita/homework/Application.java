package com.nikita.homework;

public class Application {
    public static void main(String[] args) {

        System.out.println("Starting Thread 1");
//        Task taskRunner = new Task("Thread-A");
//        Thread t1 = new Thread(taskRunner);
//        Thread t1 = new Thread(new Task("Thread-A"));
//        taskRunner.start();
//        taskRunner.run();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

        System.out.println("Starting Thread 2");

//        Task taskRunner2 = new Task("Thread-B");
//        Thread t2 = new Thread(taskRunner2);
//        Thread t2 = new Thread(new Task("Thread-B"));
//        taskRunner2.start();
//        taskRunner2.run();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();

    }
}

class Task implements Runnable {

    String name;

    public Task (String name) {
        this.name = name;
    }
    public void run() {
        Thread.currentThread().setName(this.name);
        for (int i = 0; i < 5; i++) {
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//class Task extends Thread {
//
//    String name;
//
//    public Task (String name) {
//        this.name = name;
//    }
//    public void run() {
//        Thread.currentThread().setName(this.name);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
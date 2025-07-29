package com.naveenautomationlabs.pattern.singleton.basic;

public class TestBrowserParallelExecution {

    public static void main(String[] args) {

        // Create a task to open the browser
        Runnable task = () -> {
            Browser.getInstance().openBrowser();
        };

        // Create multiple threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);
        Thread thread5 = new Thread(task);

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


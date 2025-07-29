package com.naveenautomationlabs.pattern.singleton.basic;

public class Browser {

    // 1. Create a private static instance of the same class
    // The volatile keyword in the Browser class ensures that the browser instance variable is always read from the main memory and not from a thread's local cache
    // This is crucial in a multithreaded environment to ensure visibility of changes to the browser variable across different threads
    private volatile static Browser browser;

    // 2. Private constructor to restrict the instantiation of the class from other classes
    private Browser() {

    }

    // 3. Create a public static method to provide access to the instance of the class
    public static Browser getInstance() {
        if (browser == null) {
            synchronized (Browser.class) {
                if (browser == null) {
                    browser = new Browser();
                }
            }
        }

        return browser;
    }

    // 4. Business logic (Optional)
    public void openBrowser() {
        System.out.println("Browser is opened");
    }
}

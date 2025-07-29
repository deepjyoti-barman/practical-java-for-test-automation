package com.naveenautomationlabs.pattern.singleton.basic;

public class TestBrowser {

    public static void main(String[] args) {

        // 5. Access the instance of the class using the public static method
        Browser browser1 = Browser.getInstance();
        Browser browser2 = Browser.getInstance();

        // 6. Verify the instance of the class
        System.out.println("Hashcode for first instance: " + browser1.hashCode());
        System.out.println("Hashcode for second instance: " + browser2.hashCode());
        System.out.println(browser1 == browser2);

        // 7. Access the business logic
        browser1.openBrowser();
    }
}

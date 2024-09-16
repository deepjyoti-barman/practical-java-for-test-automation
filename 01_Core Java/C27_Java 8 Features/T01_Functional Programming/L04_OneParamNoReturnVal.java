@FunctionalInterface
interface IPrintable {
    void printName(String name);
}

public class L04_OneParamNoReturnVal {
    public static void main(String[] args) {
        // Lambda expression
        // Eclipse shortcut to form lambda expression from anonymous inner class: Ctrl + 1
        IPrintable obj = name -> System.out.println("Printing the name on the console: " + name);
        obj.printName("Deepjyoti");
    }
}
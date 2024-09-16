@FunctionalInterface
interface IPrintable {
    String printHelloWorld();
}

public class L06_NoParamOneReturnVal {
    public static void main(String[] args) {
        // Lambda expression
        // Eclipse shortcut to form lambda expression from anonymous inner class: Ctrl + 1
        IPrintable obj = () -> "Hello World";
        System.out.println(obj.printHelloWorld());
    }
}
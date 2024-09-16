interface IPrintable {
    // one abstract method
    public abstract void print();

    default void scan() {
        System.out.println("Scanning the input from PDF");
    }

    static void printToWeb() {
        System.out.println("Flushing the output on the web");
    }
}

public class L03_LambdaExpression {
    public static void main(String[] args) {
        // Lambda expression
        // Eclipse shortcut to form lambda expression from anonymous inner class: Ctrl + 1
        IPrintable obj = () -> System.out.println("L03: Printing on the console");
        obj.print();
    }
}
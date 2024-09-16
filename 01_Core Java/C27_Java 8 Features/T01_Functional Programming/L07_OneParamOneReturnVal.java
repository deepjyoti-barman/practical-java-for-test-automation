@FunctionalInterface
interface IPrintable {
    String strToLowerCase(String s);
}

public class L07_OneParamOneReturnVal {
    public static void main(String[] args) {
        // Lambda expression
        // Eclipse shortcut to form lambda expression from anonymous inner class: Ctrl + 1
        IPrintable obj = s -> s.toLowerCase();
        System.out.println(obj.strToLowerCase("DEEPJYOTI"));
    }
}
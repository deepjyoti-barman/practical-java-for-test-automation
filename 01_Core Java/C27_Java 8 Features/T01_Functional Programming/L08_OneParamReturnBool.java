import java.util.function.Function;

@FunctionalInterface
interface IPrintable {
    boolean isNullOrEmpty(String s);
}

public class L08_OneParamReturnBool {
    public static void main(String[] args) {
        // Lambda expression
        // Eclipse shortcut to form lambda expression from anonymous inner class: Ctrl + 1
        IPrintable obj = s -> s == null || s == "" ? true : false;
        System.out.println(obj.isNullOrEmpty(""));
    }
}
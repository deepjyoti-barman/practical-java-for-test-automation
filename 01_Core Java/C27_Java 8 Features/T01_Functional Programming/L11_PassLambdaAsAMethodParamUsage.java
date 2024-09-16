import java.util.function.Consumer;

public class L11_PassLambdaAsAMethodParamUsage {

    public static void toLower(String s) {
        System.out.println(s.toLowerCase());
    }

    public static void toUpper(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void transform(String s, Consumer<String> c) {
        c.accept(s);
    }

    public static void main(String[] args) {
        String str1 = "deepjyoti";
        String str2 = "DEEPJYOTI";
        String str3 = "DeepJyoti";

        // Passing object as a method parameter        
        toUpper(str1);
        toLower(str2);

        // Usual way to change case-sensitivity of a string by implementing the Consumer interface through lambda expression
        Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
        consumer1.accept(str3);

        Consumer<String> consumer2 = s -> System.out.println(s.toLowerCase());
        consumer2.accept(str3);

        // Passing lambda/behavior as a method parameter
        transform(str3, s -> System.out.println(s.toUpperCase()));
        transform(str3, s -> System.out.println(s.toLowerCase()));
    }
}

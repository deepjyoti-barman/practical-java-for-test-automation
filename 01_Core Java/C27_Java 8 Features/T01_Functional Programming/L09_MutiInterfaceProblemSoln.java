import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
interface IIntPrintable {
    void print(int i);
}

@FunctionalInterface
interface IStringPrintable {
    void print(String s);
}

// Functional interface with generics to solve the issue
// Accepts one parameter of any type
@FunctionalInterface
interface IPrintable<T> {
    void print(T t);
}

// Accepts one parameter of any type and returns any type of value
@FunctionalInterface
interface IReturnable<T, R> {
    R returnVal(T t);
}

// Accepts two parameters of any type and returns any type of value
@FunctionalInterface
interface IJoiner<T, U, R> {
    R join(T t, U u);
}

public class L09_MutiInterfaceProblemSoln {
    public static void main(String[] args) {
        IIntPrintable obj1 = i -> System.out.println(i);
        obj1.print(10);

        IStringPrintable obj2 = s -> System.out.println(s);
        obj2.print("Deepjyoti");

        IPrintable<Double> obj3 = d -> System.out.println(d);
        obj3.print(2.1501);

        IReturnable<String, Boolean> obj4 = str -> (str != "" || str != null) ? true : false;
        System.out.println(obj4.returnVal("Hello Java"));

        IJoiner<String, String, String> obj5 = (part1, part2) -> part1 + " " + part2;
        System.out.println(obj5.join("Deepjyoti", "Barman"));
    }
}
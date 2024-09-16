@FunctionalInterface
interface IPrintable {
    void printFullName(String fName, String lName);
}

public class L05_TwoParamsNoReturnVal {
    public static void main(String[] args) {
        // Lambda expression
        // Eclipse shortcut to form lambda expression from anonymous inner class: Ctrl + 1
        IPrintable obj = (fName, lName) -> System.out.println(fName + " " + lName);
        obj.printFullName("Deepjyoti", "Barman");
    }
}
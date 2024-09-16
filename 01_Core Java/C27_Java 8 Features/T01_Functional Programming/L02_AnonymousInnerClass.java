interface IPrintable {
    public abstract void print();
}

public class L02_AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class - as this class is inside another class
        IPrintable obj = new IPrintable() {

            @Override
            public void print() {
                System.out.println("L02: Printing on the console");
            }
        };
        obj.print();
    }
}
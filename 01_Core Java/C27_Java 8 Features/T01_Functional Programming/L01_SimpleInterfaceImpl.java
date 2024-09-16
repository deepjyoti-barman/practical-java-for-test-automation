interface IPrintable {
    public abstract void print();
}

class ConsolePrinterImpl implements IPrintable {
    @Override
    public void print() {
        System.out.println("L01: Printing on the console");
    }
}

public class L01_SimpleInterfaceImpl {
    public static void main(String[] args) {
        IPrintable obj = new ConsolePrinterImpl();
        obj.print();
    }
}
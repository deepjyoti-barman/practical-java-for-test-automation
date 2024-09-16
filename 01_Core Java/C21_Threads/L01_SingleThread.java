public class L01_SingleThread {
    public static void main(String[] args) {

        L01_SingleThread st = new L01_SingleThread();
        st.printNumber();
        
        System.out.println("");
        for (int j = 1; j <= 20; j++) {
            System.out.print("j = " + j + "\t");
        }
    }

    void printNumber() {
        for (int i = 1; i <= 20; i++) {
            System.out.print("i = " + i + "\t");
        }
    }
}
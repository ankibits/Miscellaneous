public class Main {
    public static void main(String[] args) {
        Print<Integer> printOb = new Print<Integer>();
        printOb.setValue(10);
        System.out.println(printOb.getValue());
    }
}
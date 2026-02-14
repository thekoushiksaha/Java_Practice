public class Main {
    public Main() {
        System.out.println("Print Numbers from 0 to 100");
    }

    public void printNumbers() {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printNumbers();
    }
}
public class Main {
    public Main() {
        System.out.println("Print Even Numbers from 1 to 100");
    }

    public void printEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i % 2 == 0 ? i + ", " : "");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printEvenNumbers();
    }
}
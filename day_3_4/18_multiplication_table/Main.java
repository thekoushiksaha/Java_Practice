public class Main {

    public Main() {
        System.out.println("Multiplication Table");
    }

    public void printMultiplication(int number, int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printMultiplication(8, 10);
    }
}
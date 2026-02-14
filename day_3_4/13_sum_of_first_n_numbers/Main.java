public class Main {
    public Main() {
        System.out.println("Sum of First N Numbers");
    }

    public void sumOfFirstNNumbers(int startNumber, int endNumber) {
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }
        System.out.println("Result: " + sum);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.sumOfFirstNNumbers(1, 10);
    }
}
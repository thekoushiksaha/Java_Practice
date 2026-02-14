public class Main {

    public Main() {
        System.out.println("Sum of Digits");
    }

    public int getSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public void printSumOfDigits(int number) {
        System.out.println("Sum of Digits " + number + " is " + getSumOfDigits(number));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printSumOfDigits(22);
        obj.printSumOfDigits(324);
    }
}
public class Main {
    public Main() {
        System.out.println("Factorial of a Number");
    }

    public int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public void printFactorialOfANumber(int number) {
        System.out.println("Factorial of Number " + number + " is " + getFactorial(number));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printFactorialOfANumber(8);
    }
}
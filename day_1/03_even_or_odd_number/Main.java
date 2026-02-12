import java.util.Scanner;

public class Main {

    public Main() {
        System.out.println(" == EVEN OR ODD NUMBER == ");
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public void displayEvenOddNumbers(int startNumber, int endNumber) {
        if (startNumber > endNumber) {
            System.out.println("Error: Start number can not be greater than end number");
            return;
        }

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(isEven(i) ? i + " is an Even Number " : i + " is an Odd Number");
        }
    }

    public void checkEvenOrOddFromUserInput() {
        System.out.print("Please enter a number to check whether it is an Even or Odd Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Great! ");
        System.out.print(isEven(number) ? number + " is an Even number" : +number + " is an Odd number");

        sc.close();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.displayEvenOddNumbers(100, 100);
        obj.checkEvenOrOddFromUserInput();
    }
}
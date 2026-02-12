import java.util.Scanner;

public class Main {

    public Main() {
        System.out.println("Find Largest of Three Numbers (using nested if)");
    }

    public void getNumbersFromUser() {
        int largeNumber = 0;
        System.out.print("Enter Number 1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();

        if (num1 >= largeNumber) {
            largeNumber = num1;
            if (num2 >= largeNumber) {
                largeNumber = num2;
                if (num3 >= largeNumber) {
                    largeNumber = num3;
                }
            }
        }

        sc.close();

        System.out.println("Large number is " + largeNumber);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.getNumbersFromUser();
    }
}
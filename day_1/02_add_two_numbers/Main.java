import java.util.Scanner;

public class Main {
    // Declare constuctor ..
    public Main() {
        System.out.println("Add Two Numbers");
    }

    // Reusable fundtion ..
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Fixed values ..
    public void additionOfHardcodedValues(int num1, int num2) {
        System.out.println("Addition of the given values is " + add(num1, num2));
    }

    // Taking values from user at runtime ..
    public void additionOfUserValues() {
        System.out.println("//Addtion of two numbers given by user..");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Addition of given two numbers is : " + add(num1, num2));

        sc.close();
    }

    public static void main(String[] args) {
        // Class object declaration
        Main obj = new Main();

        // Class properties called trough object
        obj.additionOfHardcodedValues(20, 25);
        obj.additionOfUserValues();
    }
}

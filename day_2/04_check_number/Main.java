import java.util.Scanner;

public class Main {
    public Main() {
        System.out.println("Check numbers like (POSITIVE, NEGATIVE, ZERO)");
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean isNegative(int num) {
        return num < 0;
    }

    public boolean isZero(int num) {
        return num == 0;
    }

    public String validateNumber(int num) {
        String result = "";

        if (isZero(num))
            result = "Zero";
        else if (isNegative(num))
            result = "Negative";
        else if (isPositive(num))
            result = "Positive";

        return result;
    }

    public void getNumberFromUser() {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Great! it is " + validateNumber(num) + " number.");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.getNumberFromUser();
    }
}
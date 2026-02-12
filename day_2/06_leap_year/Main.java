import java.util.Scanner;

public class Main {
    public Main() {
        System.out.println("Check Leap Year");
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public void checkLeapYearFromUser() {
        System.out.print("Enter a year to check leap year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year) ? "It is Leap Year" : "It is not leap year");
        sc.close();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.checkLeapYearFromUser();
    }
}

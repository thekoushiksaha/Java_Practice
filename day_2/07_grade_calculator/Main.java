import java.util.Scanner;

public class Main {
    public Main() {
        System.out.println("Grade Calculator");
    }

    public String getGrade(int mark) {
        String result = "Invalid Mark";

        if (mark >= 91 && mark <= 100) {
            result = "A1 - Outstanding";
        } else if (mark >= 81 && mark <= 90) {
            result = "A2 - Excellant";
        } else if (mark >= 71 && mark <= 80) {
            result = "B1 - Very Good";
        } else if (mark >= 61 && mark <= 70) {
            result = "B2 - Good";
        } else if (mark >= 51 && mark <= 60) {
            result = "C1 - Above Average";
        } else if (mark >= 41 && mark <= 50) {
            result = "C2 - Average";
        } else if (mark >= 33 && mark <= 40) {
            result = "D - Fair (Pass)";
        } else if (mark < 33) {
            result = "Fail";
        }

        return result;
    }

    public void validateMarkFromUser() {
        System.out.print("Enter Mark (mark must be between 0-100): ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        System.out.println(getGrade(mark));
        sc.close();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.validateMarkFromUser();
    }
}
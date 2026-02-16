import java.util.Scanner;

public class Main {
    int[] numberList = new int[5];
    int inputCount = 0;
    Scanner sc = new Scanner(System.in);

    public Main() {
        System.out.println("Take 5 Numbers as Input and Print Them");
    }

    public void userInput() {
        if (inputCount == 5)
            return;
        System.out.print("Input No. " + inputCount + ", Enter Number: ");
        numberList[inputCount] = sc.nextInt();
        inputCount++;
        userInput();
    }

    public void printNumberList() {
        userInput();
        System.out.println("Printing Number List: ");
        for (int i = 0; i < numberList.length; i++) {
            System.out.print(numberList[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printNumberList();
    }
}
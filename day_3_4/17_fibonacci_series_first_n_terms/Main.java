public class Main {

    public Main() {
        System.out.println("Fibonacci Series (First N Terms)");
    }

    public void printFibonacciFirstNTerms(int range) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = firstTerm + secondTerm;
        for (int i = 1; i <= range; i++) {
            System.out.print(firstTerm + ", ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
            nextTerm = firstTerm + secondTerm;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printFibonacciFirstNTerms(10);
    }
}
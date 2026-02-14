public class Main {

    public Main() {
        System.out.println("Reverse Number");
    }

    public int getReverseNumber(int number) {
        int revNumber = 0;

        while (number != 0) {
            revNumber = revNumber * 10 + number % 10;
            number /= 10;
        }

        return revNumber;
    }

    public void printReverseNumber(int number) {
        System.out.println("Input Number: " + number + " | Reverse Number: " + getReverseNumber(number));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printReverseNumber(456);
        obj.printReverseNumber(-123);
    }
}
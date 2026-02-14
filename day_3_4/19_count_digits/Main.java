public class Main {

    public Main() {
        System.out.println("Count Digits");
    }

    public int getCountOfDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public void printCountOfDigits(int number) {
        System.out.println("Count of Digits " + number + " is " + getCountOfDigits(number));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printCountOfDigits(100);
        obj.printCountOfDigits(99);
        obj.printCountOfDigits(8);
    }
}
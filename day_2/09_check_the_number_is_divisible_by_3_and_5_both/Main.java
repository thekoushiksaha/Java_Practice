public class Main {
    public Main() {
        System.out.println("Check whether the number is divisible by 3 and 5 both");
    }

    public void checkTheNumber(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.checkTheNumber(0, 1000);
    }
}
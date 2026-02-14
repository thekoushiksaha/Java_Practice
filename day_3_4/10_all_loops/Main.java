public class Main {
    public Main() {
        System.out.println("All Loops");
    }

    public void forLoop(int range) {
        System.out.println("For loop in range of " + range);
        for (int i = 0; i < range; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public void whileLoop(int range) {
        System.out.println("While loop in range of " + range);
        int i = 0;
        while (i < range) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println("");
    }

    public void doWhileLoop(int range) {
        System.out.println("Do While loop in range of " + range);
        int i = 0;
        do {
            System.out.print(i + ", ");
            i++;
        } while (i < range);
        System.out.println("");
    }

    public void loopWithBreakAndContinue(int range) {
        System.out.println("Loop with break and continue in range of " + range);
        for (int i = 0; i < range; i++) {
            System.out.print(i + ", ");
            if (i == range / 2) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.forLoop(10);
        obj.whileLoop(20);
        obj.doWhileLoop(30);
        obj.loopWithBreakAndContinue(10);
    }
}
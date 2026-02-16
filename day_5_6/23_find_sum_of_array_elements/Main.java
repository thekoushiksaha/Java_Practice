public class Main {

    int[] arr1 = { 3, 9, 5, 7 };

    public Main() {
        System.out.println("Find Sum of Array Elements");
    }

    public void printSumOfArrayElements() {
        int sum = 0;
        System.out.println("Array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nSum of Array Elements: " + sum);

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printSumOfArrayElements();
    }
}
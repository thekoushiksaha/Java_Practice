
public class Main {

    int[] arr1 = { 2, 4, 1, 8 };
    int[] arr2 = new int[4];

    public Main() {
        System.out.println("Simple Array");
    }

    public void printArray() {
        System.out.println("Array 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
            arr2[i] = arr1[i];
        }
        System.out.println("\nArrayt 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printArray();
    }
}
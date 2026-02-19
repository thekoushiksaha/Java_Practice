public class Main {

    public Main() {
        System.out.println("= Check is Array Sorted or Not =");
    }

    public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void printArrayWithSortedStatus(int[] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nSorted: " + isSorted(arr));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr1 = { 1, 5, 2, 7 };
        int[] arr2 = { 3, 6, 7, 18 };
        obj.printArrayWithSortedStatus(arr1);
        obj.printArrayWithSortedStatus(arr2);
    }
}
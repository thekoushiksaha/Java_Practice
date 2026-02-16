public class Main {
    public Main() {
        System.out.println("Find Second Large Element in Array");
    }

    public int getSecondLargeElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second) {
                second = i;
            }
        }
        return second;
    }

    public void printArray(int[] arr) {
        System.out.println("Array: ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("\nSecond Large Element is " + getSecondLargeElement(arr));
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr1 = { 3, 9, 1, 5 };
        int[] arr2 = { -3, -9, -1, -5 };
        int[] arr3 = { 3, 9, 1, 5, 9 }; // Output will be 9 as it is there in array twice.
        obj.printArray(arr1);
        obj.printArray(arr2);
        obj.printArray(arr3);
    }
}

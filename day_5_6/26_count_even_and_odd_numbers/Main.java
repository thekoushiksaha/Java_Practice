public class Main {

    public Main() {
        System.out.println("Count Even and Odd Numbers");
    }

    public void printArray(int[] arr) {
        int countEven = 0;
        int countOdd = 0;

        System.out.println("Array List: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            if (arr[i] % 2 == 0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println("\nCount of Even Numbers: " + countEven);
        System.out.println("Count of Odd Numbers: " + countOdd);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr1 = { 3, 9, 10, 5, 4 };
        int[] arr2 = { 6, 18, 30, 20, 7 };
        obj.printArray(arr1);
        obj.printArray(arr2);
    }
}
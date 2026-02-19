public class Main {

    public Main() {
        System.out.println("= Count Frequency of Each Elements =");
    }

    public void printFrequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean isAlreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    isAlreadyChecked = true;
                }
            }
            if (isAlreadyChecked) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            System.out.println(arr[i] + "->" + count);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = { 1, 2, 2, 3 };
        obj.printFrequency(arr);
    }
}
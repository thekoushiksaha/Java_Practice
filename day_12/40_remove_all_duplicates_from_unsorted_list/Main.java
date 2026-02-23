import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> tempArr = new LinkedHashSet<>();
        for (int e : arr) {
            tempArr.add(e);
        }
        int[] result = new int[tempArr.size()];
        int index = 0;
        for (int e : tempArr) {
            result[index++] = e;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("= Remove All Duplicates From Unsorted List =");
        int[] arr = { 3, 1, 9, 3, 7, 1, 5, 5 };
        System.out.println(Arrays.toString(arr));
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
}
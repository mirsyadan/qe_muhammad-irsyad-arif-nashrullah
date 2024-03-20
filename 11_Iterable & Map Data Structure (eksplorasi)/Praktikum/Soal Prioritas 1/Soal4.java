package soal4;
import java.util.*;
public class Soal4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};
        int[] result1 = findUniqueElements(array1, array2);
        System.out.println("Output: " + Arrays.toString(result1));

        int[] array3 = {3, 8};
        int[] array4 = {2, 8};
        int[] result2 = findUniqueElements(array3, array4);
        System.out.println("Output: " + Arrays.toString(result2));
    }

    public static int[] findUniqueElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int num : arr1) {
            if (!set.contains(num)) {
                resultList.add(num);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
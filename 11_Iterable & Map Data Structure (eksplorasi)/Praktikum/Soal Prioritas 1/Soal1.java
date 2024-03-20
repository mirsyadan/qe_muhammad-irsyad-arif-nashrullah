package soal1;
import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        String[] array1 = {"'kazuya'", "'jin'", "'lee'"};
        String[] array2 = {"'kazuya'", "'feng'"};

        String[] mergedArray = mergeAndRemoveDuplicates(array1, array2);
        System.out.println(Arrays.toString(mergedArray));

        String[] array3 = {"'lee'", "'jin'"};
        String[] array4 = {"'kazuya'", "'panda'"};

        mergedArray = mergeAndRemoveDuplicates(array3, array4);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static String[] mergeAndRemoveDuplicates(String[] array1, String[] array2) {
        Set<String> mergedSet = new HashSet<>();
        mergedSet.addAll(Arrays.asList(array1));
        mergedSet.addAll(Arrays.asList(array2));

        List<String> mergedList = new ArrayList<>(mergedSet);
        String[] mergedArray = new String[mergedList.size()];
        mergedArray = mergedList.toArray(mergedArray);

        return mergedArray;
    }
}
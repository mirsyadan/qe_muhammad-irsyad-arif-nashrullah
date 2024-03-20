package soal5;
public class Soal5 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 3, 3, 6, 9, 9};
        int[] arr2 = {2, 2, 2, 11};

        System.out.println(removeDuplicates(arr1)); 
        System.out.println(removeDuplicates(arr2));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int nonDuplicateIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[nonDuplicateIndex] = nums[i];
                nonDuplicateIndex++;
            }
        }

        return nonDuplicateIndex;
    }
}
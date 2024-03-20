package soal3;
import java.util.*;
public class Soal3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] result1 = findPair(nums1, target1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] result2 = findPair(nums2, target2);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] findPair(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}
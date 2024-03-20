package soal6;
public class Soal6 {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println(findMaxSumSubarray(arr1, k1));
        
        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        System.out.println(findMaxSumSubarray(arr2, k2));
    }

    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
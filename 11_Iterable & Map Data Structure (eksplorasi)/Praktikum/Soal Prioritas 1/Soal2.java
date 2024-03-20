package soal2;
import java.util.*;
public class Soal2 {
    public static void main(String[] args) {
        String input1 = "76523752";
        String input2 = "1122";

        List<Integer> output1 = findUniqueNumbers(input1);
        List<Integer> output2 = findUniqueNumbers(input2);

        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: " + output1);

        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: " + output2);
    }

    public static List<Integer> findUniqueNumbers(String input) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char digit : input.toCharArray()) {
            countMap.put(digit, countMap.getOrDefault(digit, 0) + 1);
        }

        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(Character.getNumericValue(entry.getKey()));
            }
        }

        return uniqueNumbers;
    }
}

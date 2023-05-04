import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static List<String> words = new ArrayList<>(List.of("американо", "капучино", "латте", "ристретто",
            "капучино", "американо"));
    private static List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        printOddNumbers(nums);
        printOddNumbersWithoutRepeats(nums);
        printUniqueWords(words);
        countNumberOfRepeats(strings);
    }

    public static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (!(num % 2 == 0)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbersWithoutRepeats(List<Integer> nums) {
        Set<Integer> numbers = new HashSet<>(nums);
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    public static void printUniqueWords (List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        for (String uniqueWord : uniqueWords) {
            System.out.print(uniqueWord + " ");
        }
        System.out.println();
    }
    public static void countNumberOfRepeats (List<String> strings) {
        Set<String> uniqueSet = new HashSet<>(strings);
        for (String s : uniqueSet) {
            System.out.println(s + ": " + Collections.frequency(strings, s));
        }
    }
}
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("собака", "на", "сене", "собака"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(words);
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        System.out.println(result);
    }

    public static void task2(List<Integer> nums) {

        Set<Integer> result = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        System.out.println(result);
    }

    //
    public static void task3(List<String> words) {
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> countByWord = new HashMap<>();
        for (String s : strings) {
            if (countByWord.containsKey(s)) {
                countByWord.put(s, countByWord.get(s)+ 1);
            } else countByWord.put(s, 1);
        }
        System.out.println(countByWord);
    }
}
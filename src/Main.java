import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public static void task2(List<Integer> nums) {
        Set<Integer> result = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        System.out.println(result);
}
}
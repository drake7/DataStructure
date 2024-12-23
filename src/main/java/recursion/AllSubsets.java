package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        System.out.println("\nFinal Result: " + result);
    }

    private static void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        System.out.println("Current Subset: " + current + ", Index: " + index);

        if (index == nums.length) { // Base case: no more elements to consider
            System.out.println("Adding to result: " + current);
            result.add(new ArrayList<>(current)); // Add current subset to result
            return;
        }

        // Include the current element
        System.out.println("Include: " + nums[index]);
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result); // Recurse to next element
        current.remove(current.size() - 1); // Backtrack: undo the inclusion
        System.out.println("Backtrack after including: " + nums[index]);

        // Exclude the current element
        System.out.println("Exclude: " + nums[index]);
        generateSubsets(nums, index + 1, current, result); // Recurse to next element
        System.out.println("Backtrack after excluding: " + nums[index]);
    }
}

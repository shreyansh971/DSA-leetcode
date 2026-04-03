import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices.
        // The key will be the number, and the value will be its index in the array.
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the 'complement' needed to reach the target
            int complement = target - nums[i];

            // Check if the complement already exists in our HashMap
            if (numMap.containsKey(complement)) {
                // If it does, we've found our two numbers.
                // Return the index of the complement and the current index.
                return new int[] { numMap.get(complement), i };
            }

            // If the complement is not found, add the current number and its index to the HashMap
            numMap.put(nums[i], i);
        }

        // If no solution is found (though the problem guarantees one),
        // you might throw an exception or return an empty array.
        // For this problem, it's guaranteed a solution exists, so this line won't be reached.
        return new int[] {};
    }
}

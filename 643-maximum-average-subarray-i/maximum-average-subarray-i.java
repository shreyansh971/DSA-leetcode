class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // 1. Calculate the sum of the very first window
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;

        // 2. Slide the window from index k to the end
        for (int i = k; i < nums.length; i++) {
            // Add the new element (entering from right)
            // Subtract the old element (leaving from left)
            currentSum += nums[i] - nums[i - k];
            
            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        // 3. Return the average
        return maxSum / k;
    }
}
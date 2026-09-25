class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize tracking variables with the first element
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            
            // Store maxProd before updating because minProd needs the old value
            int tempMax = maxProd;

            // Calculate the 3 possible choices for the new max and min
            

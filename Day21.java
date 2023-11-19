class Solution {
    public int reductionOperations(int[] nums) {
    Arrays.sort(nums); // Sort the input array 'nums' in non-decreasing order
    int n = nums.length; // Get the size of the input array
    int sum = 0, temp = 0; // Initialize variables to keep track of sum and temporary count

    // Iterate through the sorted array
    for (int i = 1; i < n; i++) {
        // Check if the current element is different from the previous one
        if (nums[i] != nums[i - 1]) {
            temp++; // Increment temporary count for a new unique element
        }
        sum += temp; // Add the temporary count to the sum for each iteration
    }

    return sum; // Return the final sum, which represents the number of operations performed
}
}
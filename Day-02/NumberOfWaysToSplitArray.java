class Solution {
    public int waysToSplitArray(int[] nums) {

        long total = 0;

        // Find total sum
        for (int num : nums) {
            total += num;
        }

        long leftSum = 0;
        int count = 0;

        // i stops at n-2 because both parts must be non-empty
        for (int i = 0; i < nums.length - 1; i++) {

            leftSum += nums[i];

            long rightSum = total - leftSum;

            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }
}

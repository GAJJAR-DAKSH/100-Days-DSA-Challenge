class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // remainder 0 occurs before the array starts
        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            if (map.containsKey(rem)) {

                int previousIndex = map.get(rem);

                // At least 2 elements
                if (i - previousIndex >= 2) {
                    return true;
                }

            } else {
                // Store FIRST occurrence only
                map.put(rem, i);
            }
        }

        return false;
    }
}

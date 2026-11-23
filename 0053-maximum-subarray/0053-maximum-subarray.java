class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current < 0) {
                current = nums[i];   // start fresh
            } else {
                current = current + nums[i];
            }
            if (current > best) {
                best = current;
            }
        }
        return best;
    }
}

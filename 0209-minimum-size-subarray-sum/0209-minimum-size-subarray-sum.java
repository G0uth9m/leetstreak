class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int n = nums.length;
        int length = Integer.MAX_VALUE;

        int j = 0;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            while (sum >= target) {

                length = Math.min(length, i - j + 1);

                sum -= nums[j];
                j++;
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
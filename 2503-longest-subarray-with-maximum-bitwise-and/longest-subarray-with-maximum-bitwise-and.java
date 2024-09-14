class Solution {
        public int longestSubarray(int[] nums) {
        int max = 0, longest = 1, cur = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        for (int num : nums) {
            if (num == max) {
                longest = Math.max(longest, ++cur);
            }else {
                cur = 0;
            }
        }
        return longest;
    }
}
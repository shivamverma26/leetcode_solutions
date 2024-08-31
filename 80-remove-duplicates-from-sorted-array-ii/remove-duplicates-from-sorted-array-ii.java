class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;

        int i = 1; 
        int count = 1; 

        for (int j = 1; j < n; j++) {
            if (nums[j] == nums[j - 1]) {
                count++;
            } else {
                count = 1; 
            }

            if (count <= 2) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; 
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]!=0){
                int tmp=nums[r];
                nums[r]=nums[l];
                nums[l]=tmp;
                l++;
            }
            r++;
        }
    }
}
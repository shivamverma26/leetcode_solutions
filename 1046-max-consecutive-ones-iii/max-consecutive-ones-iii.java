class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
     int l=0;
     int r=0;
     int zeros=0;
     int len=0;
     int max=0;
     while(r<n){
        if(nums[r]==0) zeros++;
        while(zeros>k){
            if(nums[l]==0) zeros--;
            l++;
        }
        if(zeros<=k) {
            len=r-l+1;
            max=Math.max(len,max);
        }
        r++;
     }   return max;
    }
}
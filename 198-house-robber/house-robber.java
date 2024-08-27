class Solution {
    public int rob(int[] nums) {
     int n =nums.length;
 
     if(n==0) return 0;
     if(n==1) return nums[0];
    int prev2=nums[0];
    int prev=Math.max(nums[1],nums[0]);
     for(int i=2;i<n;i++){
        int temp=Math.max(nums[i]+prev2,prev);
        prev2=prev;
        prev=temp;
     }
     return prev;
   
    }
}
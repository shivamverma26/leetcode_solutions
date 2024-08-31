class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            
            sum+=nums[j];
            
            if(sum>=target) 
                len=Math.min(len,j-i+1);
            
            while(sum>=target){
                sum-=nums[i++];

                 if(sum>=target) 
                len=Math.min(len,j-i+1);
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}
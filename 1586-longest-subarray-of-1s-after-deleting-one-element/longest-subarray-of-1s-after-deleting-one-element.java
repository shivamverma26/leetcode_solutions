class Solution {
    public int longestSubarray(int[] nums) {
        // int n=nums.length;
        // int max=0;
        //  int zero=0;
        //  int len=0;

        // for(int i=0;i<n;i++){

        //    zero=0;
        //    for(int j=i;j<n;j++){
        //     if(nums[j]==0) zero++;

        //     if(zero<=1){
        //         len=j-i+1;
        //          max=Math.max(len,max);
        //     }
        //     else  break;
            
        //    }
        // }
        // return max-1;

        int n=nums.length;
        int l=0;
        int r=0;
        int zero=0;
        int len=0;
        int max=0;

        while(r<n){
            if(nums[r]==0) zero++;
            if(zero<=1) {
                len=r-l+1;
                max=Math.max(len,max);
            }
            else{
                while(l<r&&zero>1){
                    if(nums[l]==0) zero--;
                    l++;
                    break;
                }
            }
            r++;
        }
        return max-1;
    }
}
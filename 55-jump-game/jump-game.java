class Solution {
    public static boolean solver(int ind,int[] nums,int []dp)
    {
        int n=nums.length;
        if(ind>=n-1)
        return true;

        if(dp[ind]!=-1)
        return dp[ind]==0?false:true;

        for(int i=1;i<=nums[ind];i++){
            if(solver(ind+i,nums,dp)==true){
            dp[ind]=1;
            return true;
            }
    }
        dp[ind]=0;
        return false;
    }
   public boolean canJump(int[] nums) {
    int n=nums.length;
    int dp[]=new int[n];
    Arrays.fill(dp,-1);

    return solver(0,nums,dp);
}
}
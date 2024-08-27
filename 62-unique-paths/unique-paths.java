class Solution {
    
    public int solver(int i,int j,int m,int n, int dp[][]){
        if(i>=m||j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==m-1&&j==n-1) return 1;;
        int down=solver(i+1,j,m,n,dp);
        int right=solver(i,j+1,m,n,dp);

        return dp[i][j]=down+right;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solver(0,0,m,n,dp);
        return ans;

    }
}
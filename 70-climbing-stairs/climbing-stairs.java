class Solution {
    public int climbStairs(int n) {
        if(n==1)
        return 1;
        int left=1;
        int right=1;
        for(int i=2;i<=n;i++){
            int total=left+right;
            left =right;
            right=total;
        }
        return right;
    }
}
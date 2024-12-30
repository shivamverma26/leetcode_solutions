class Solution {
  
    public int largestCombination(int[] candidates) {
        int[] ans = new int[32];
        
        for(int x : candidates) {
            find(x, ans);
        }
        
        int res = 0;
        for(int i = 0; i < 32; i++) {
            res = Math.max(res, ans[i]);
        }
        
        return res;
    }
    
    public void find(int n, int[] ans) {
        int j = 31;
        
        while(n > 0) {
            int a = (n & 1);
            
            ans[j] += a;
            
            n >>= 1;
            
            j--;
        }
    }
}
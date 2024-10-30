class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        
        for (int i = 0; i < n; i++){
            int max = 1;
            for (int j = 0;j <i; j++){
                if (nums[j] < nums[i]){
                    max = Math.max(max, lis[j] + 1);
                }
            }
             lis[i] = max;
        }
        
        int[] lds = new int[n];
        for (int i = n-1; i >= 0; i--){
            int max = 1;
            for (int j = i+1; j < n; j++){
                if (nums[i] > nums[j]){
                    max = Math.max(max, lds[j]+ 1);
                }
            }
            lds[i] = max;
        }
        
		
		
        int lbs = 0;
        for (int i = 0; i < n; i++){
            if (lis[i] > 1 && lds[i] > 1)
            lbs = Math.max(lis[i] + lds[i]-1, lbs);
        }
        return n - lbs;
    }
}
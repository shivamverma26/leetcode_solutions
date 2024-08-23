class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
      if(k>n) return -1;
      
      double sum1=0;
      double sum2=0;

        for(int i=0;i<k;i++){
        sum1+=nums[i];
      }
     sum2= sum1;
      for(int i=k;i<n;i++){
        sum1+=nums[i];
        sum1=sum1-nums[i-k];
         sum2= Math.max(sum1,sum2);
      }
      return sum2/k;
    }
}
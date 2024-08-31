class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int i=0;
        int j=0;
        while(j<n){
            if(nums[i]==nums[j]){
                 j++;
                 if(j>=n) break;
            }
           
            if(nums[i]!=nums[j]){
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        return i+1;
    }
}
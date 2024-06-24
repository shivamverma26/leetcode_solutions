class Solution {
    public int minimumOperations(int[] nums) {
        int total=0;
     for(int i=0;i<nums.length;i++){
        nums[i]%=3;
       if(nums[i]==1 ||nums[i]==2)
       total+=1;
     }   
     return total;
    }
}
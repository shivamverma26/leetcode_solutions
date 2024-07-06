class Solution {
    public int minOperations(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&count%2==0)
                count++;

                if(nums[i]==1&&count%2==1)
                    count++;
                
            
        }
        return count;
    }
}
class Solution {
    public int maxOperations(int[] nums, int k) {
        int low=0;
        int high=nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(low<high){
            int sum=nums[low]+nums[high];
            if(sum==k)
            {
                count++;
                low++;
                high--;
            }else if(sum>k) high--;
            else low++;
        } return count;
    }
}
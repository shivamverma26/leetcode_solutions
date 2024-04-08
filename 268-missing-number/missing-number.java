class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int xor2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            xor1^=nums[i];
            xor2^=i;
        }
        xor2^=n;
        return xor1^xor2;
        
    }
}
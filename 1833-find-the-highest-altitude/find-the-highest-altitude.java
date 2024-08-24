class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        // int res[]=new int[n+1];
        int max=0;
        // res[0]=0;
        int temp=0;
        for(int i=0;i<n;i++){
           
            max=Math.max(max,gain[i]+temp);
            temp+=gain[i];
        }
        return max;
    }
}
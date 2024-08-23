class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        int count =1;
        int maxcount=1;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)+1==s.charAt(i+1))
            count++;
            else count =1;

            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}
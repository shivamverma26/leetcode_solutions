class Solution {
    public int maxProfit(int[] a) {
        
        int max=0;
        int min=a[0];
        for(int i=0;i<a.length;i++){
            int cost=a[i]-min;
            max=Math.max(cost,max);
            min=Math.min(a[i],min);
        }
        return max;
    }
}
class Solution {
    public int[] rearrangeArray(int[] a) {
        int n=a.length;
          int ans[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(a[i]<0){
            ans[neg]=a[i];
            neg+=2;
            }
            if(a[i]>=0){
                ans[pos]=a[i];
                pos=pos+2;
            }
        } return ans;
    }
}
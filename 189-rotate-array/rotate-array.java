class Solution {
    public void rotate(int[] a, int d) {
        int n=a.length;
        d%=n;
        reverse(a,0,n-d-1);
        reverse(a,n-d,n-1);
        reverse(a,0,n-1);
    }
    public int[] reverse(int[] a, int low,int high) {
         while(low<high){
            int tmp=a[low];
            a[low]=a[high];
            a[high]= tmp;
            low++;
            high--;
         }
      return a;
    }
}
class Solution {
    public int findLongestChain(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
       
        int len = 0;
        int curr_end = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > curr_end) {  
                len++;
                curr_end = arr[i][1];
            }
        }
        return len;
    }
}

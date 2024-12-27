class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int prev_max = A[0]+0;
        int res = A[0] + A[1] - 1;
        for(int j = 1; j < A.length; j++){

            res = Math.max(prev_max + A[j] - j, res);
            prev_max = Math.max(A[j] + j, prev_max);
        }
        return res;
    }
}
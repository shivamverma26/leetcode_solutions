class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int total = a + b + c;
        int curA = 0, curB = 0, curC = 0;
        while (total-- > 0) {
            if ((a >= b&&a >= c&& curA <2) || (a > 0 && (curB == 2 ||curC == 2))){
                sb.append('a');
                curA++;
                a--;
                curB = 0;
                curC = 0;
                
            }
            else if((b >= c&& b>= a&& curB < 2)||(b > 0 && (curA==2 || curC==2))) {
                sb.append('b');
                curB++;
                b--;
                curA = 0;
                curC = 0;
            }
            else if((c >= a &&c>=b&& curC < 2)||(c > 0 &&(curB == 2 || curA==2))) {
                sb.append('c');
                curC++;
                c--;
                curA = 0;
                curB = 0;
            }
        }
        return sb.toString();
    }
}
class Solution {
    public String fractionAddition(String expression) {
        int n1 = 0, d1 = 1; 
        int n = expression.length(), i = 0;
        while (i < n) {
            
            boolean negative = expression.charAt(i) == '-';
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') i++;

            int n2 = 0, d2 = 0;
            while (i < n && Character.isDigit(expression.charAt(i)))
                n2 = n2 * 10 + (expression.charAt(i++) - '0');

            if (i < n && expression.charAt(i) == '/') i++;

            while (i < n && Character.isDigit(expression.charAt(i)))
                d2 = d2 * 10 + (expression.charAt(i++) - '0');

            if (negative) n2 = -n2;

            int[] result = calculate(n1, d1, n2, d2);
            n1 = result[0];
            d1 = result[1];
        }

        return n1 + "/" + d1;
    }
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }
    private int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
    private void reduce(int[] fraction) {
        int GCD = gcd(fraction[0], fraction[1]);
        fraction[0] /= GCD;
        fraction[1] /= GCD;
    }
    private int[] calculate(int n1, int d1, int n2, int d2) {
        int lcmDenominator = lcm(d1, d2);
        int adjustedNum1 = n1 * (lcmDenominator / d1);
        int adjustedNum2 = n2 * (lcmDenominator / d2);

        int numerator = adjustedNum1 + adjustedNum2;
        int denominator = lcmDenominator;

        int[] result = new int[]{numerator, denominator};
        reduce(result);
        return result;
    }
}
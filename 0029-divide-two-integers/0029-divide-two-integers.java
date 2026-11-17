class Solution {
    public int divide(int dividend, int divisor) {

        int MAX = Integer.MAX_VALUE;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return MAX;
        }

        int sign;

        if ((dividend < 0) != (divisor < 0)) {
            sign = -1;
        } else {
            sign = 1;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long res = 0;

        while (a >= b) {

            long temp = b;
            long times = 1;

            while (a >= temp + temp) {
                temp = temp + temp;
                times = times + times;
            }

            a = a - temp;
            res = res + times;
        }

        if (sign == -1) {
            res = -res;
        }

        return (int) res;
    }
}
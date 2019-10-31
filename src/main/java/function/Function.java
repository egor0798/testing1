package function;

public class Function {
    private final static double EPS = 1E-2;

    public static double sin(double val) {
        if (Double.isNaN(val) || val >= Double.POSITIVE_INFINITY || val <= Double.NEGATIVE_INFINITY) {
            return Double.NaN;
        }
        double result = 0, prevRes = 0;
        int n = 1;
        do {
            prevRes = result;
            result += Math.pow(-1, n - 1) * ( Math.pow(val, 2*n - 1) / Function.factorial(2 * n - 1));
            n++;
        } while (Math.abs(result - prevRes) > EPS);

        return result;
    }

    private static int factorial(int val) {
        if(val <= 1)
            return 1;
        else
            return val * (factorial(val - 1));
    }
}

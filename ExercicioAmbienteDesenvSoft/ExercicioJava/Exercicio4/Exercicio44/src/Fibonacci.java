public class Fibonacci {
    public static long fibonacci(int n) {
            if (n <= 1)
                return n;
            else
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


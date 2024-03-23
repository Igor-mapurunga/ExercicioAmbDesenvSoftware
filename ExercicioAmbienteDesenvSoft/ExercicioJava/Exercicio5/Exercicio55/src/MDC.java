public class MDC {
        public static long mdc(long a, long b) {
            if (b == 0)
                return a;
            else
                return mdc(b, a % b);
        }
    }


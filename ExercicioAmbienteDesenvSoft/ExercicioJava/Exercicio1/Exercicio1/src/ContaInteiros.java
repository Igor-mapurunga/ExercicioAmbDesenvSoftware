 public class ContaInteiros {
        public static int conta(int n, int[] data) {
            int count = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i] >= n && data[i] == (int)data[i]) {
                    count++;
                }
            }
            return count;
        }

    }

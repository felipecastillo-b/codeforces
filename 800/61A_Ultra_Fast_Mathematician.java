import java.io.*;
import java.util.*;

public class Main {

    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = 1;
        // t = in.nextInt(); // multiple cases
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        String n1 = in.nextLine();
        String n2 = in.nextLine();
        String result = "";

        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != n2.charAt(i)) {
                result = result + "1";
            } else {
                result = result + "0";
            }
        }

        out.println(result);
    }

    // Fast I/O
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

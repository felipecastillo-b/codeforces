import java.io.*;
import java.util.*;

public class Main {

    static FastReader in = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        out.flush();
    }

    static void solve() {
        int n = in.nextInt();
        String digits = String.valueOf(n);

        if (n % 4 == 0 || n % 7 == 0 || n % 47 == 0) { // more numbers like 44, 47, 444, 777, etc
            out.println("YES");
            return;
        }

        for (int i = 0; i < digits.length(); i++) {
            char x = digits.charAt(i);

            if (x != '4' && x != '7') {
                out.println("NO");
                return;
            }
        }
        out.println("YES");
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

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
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        String s = a + b;

        // Best performance example
        // for (char ch : (a + b).toCharArray()) {
        //     count[ch - 'A']++;
        // }
        // for (char ch : c.toCharArray()) {
        //     count[ch - 'A']--;
        // }

        if (s.length() != c.length()) {
            out.println("NO");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length(); j++) {
                if (s.charAt(i) == c.charAt(j)) {
                    c = c.substring(0, j) + c.substring(j + 1);
                    break;
                }
            }
        }

        out.println(c.length() != 0 ? "NO" : "YES");
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

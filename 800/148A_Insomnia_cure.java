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
        // es posible optimizarlo
        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int d = in.nextInt();
        Set<Integer> dragonsDamaged = new HashSet<>();

        for (int i = k-1; i < d; i+= k) {
            dragonsDamaged.add(i+1);
        }

        for (int i = l-1; i < d; i+= l) {
            dragonsDamaged.add(i+1);
        }

        for (int i = m-1; i < d; i+= m) {
            dragonsDamaged.add(i+1);
        }

        for (int i = n-1; i < d; i+= n) {
            dragonsDamaged.add(i+1);
        }

        out.println(dragonsDamaged.size());
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

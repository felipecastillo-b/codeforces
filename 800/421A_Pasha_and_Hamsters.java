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
        int a = in.nextInt();
        int b = in.nextInt();
        Set<Integer> arthurLikes = new HashSet<>();
        Set<Integer> alexanderLikes = new HashSet<>();

        for (int i = 0; i < a; i++) {
            arthurLikes.add(in.nextInt());
        }
        
        for (int i = 0; i < b; i++) {
            alexanderLikes.add(in.nextInt());
        }

        for (int i = 0; i < n; i++) {
            if (arthurLikes.contains(i+1)) {
                out.print(1 + " ");
            } else {
                out.print(2 + " ");
            }
        }
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

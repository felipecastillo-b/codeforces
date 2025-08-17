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
        Set<Integer> possibleLines = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int r = in.nextInt();
            Set<Integer> stopsLines = new HashSet<>();

            for (int j = 0; j < r; j++) {
                int stop = in.nextInt();
                stopsLines.add(stop);
            }

            if (i == 0) {
                possibleLines.addAll(stopsLines);
            } else {
                possibleLines.retainAll(stopsLines);
            }
        }

        for (int line : possibleLines) {
            out.print(line + " ");
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

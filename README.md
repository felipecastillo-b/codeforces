# codeforces
Codeforces practice

### Tips

### Reverse Sort

 - Sort Array before Reverse Sort

 ```java
 Integer[] coins = new Integer[n]; // 3, 7, 9, 1
 Arrays.sort(coins, Collections.reverseOrder());
 // sort 1, 3, 7, 9
 // reverseOrder 9, 7, 3, 1
 ```

#### HashSet

 - Collection that store unique elements, without a specifico order.

```java
String s = String.valueOf(y);
Set<Character> digits = new HashSet<>();

for (char c : s.toCharArray()) {
    digits.add(c);
}
```

#### toCharArray

 - Convert String to Char Array.

```java
String s = in.nextLine();
char[] c = s.toCharArray();
```

### Template

```java
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
        // Solve Problem
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

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

```
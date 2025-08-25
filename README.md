# codeforces

Codeforces practice

## Tips

### C++

#### Syntax

- Basic Syntax

```cpp
cin >> t; // Input
cout << t; // Output
int aux = 5;
vector<int> v(aux); // // 5 size Array

// Types
int a = 10;
float b = 5.5;
double c = 9.12345;
char d = 'A';
bool e = true;
string s = "Hello Chonka";

// Operators
int sum = a + 5;
int mult = a * 2;
bool isEqual = (a == 10);

// If
if (a > 5) {
    cout << "Mayor que 5" << endl;
} else {
    cout << "Menor o igual a 5" << endl;
}

// While
int i = 0;
while (i < 5) {
    cout << i << " ";
    i++;
}

// For
for (int i = 0; i < aux; i++) { // Assign values
        v[i] = i + 1;
    }

for (int i = 0; i < aux; i++) { // Print values
        cout << v[i] << " ";
    }

// Functions
int sum(int x, int y) {
    return x + y;
}

// Lowercase
string s; cin >> s;

for (char &c : s)
{
    c = tolower(c);
}
```

### Java

#### Reverse Sort

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

- Compare two Set.

```java
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
        possibleLines.addAll(stopsLines); // agrega todo
    } else {
        possibleLines.retainAll(stopsLines); // solo retiene las que se repiten
    }
}

for (int line : possibleLines) {
    out.print(line + " ");
}
```

- Search a specific element in HashSet

```java
Set<Integer> arthurLikes = new HashSet<>();

for (int i = 0; i < a; i++) {
    arthurLikes.add(in.nextInt());
}

if (arthurLikes.contains(i)) {
    out.print(1 + " ");
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

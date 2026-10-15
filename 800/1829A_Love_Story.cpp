/**
 *  author: castillodk
**/
#include <bits/stdc++.h>
#include <cstddef>
using namespace std;

#define ll long long
#define all(x) (x).begin(), (x).end()
#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);

int main() {
    fast_io;

    int t; cin >> t;

    while (t--) {
        string s; cin >> s;
        string a = "codeforces";
        int aux = 0;

        for (size_t i = 0; i < s.length(); i++) {
            if (s[i] != a[i]) {
                aux++;
            }
        }
        cout << aux << endl;
    }
    return 0;
}

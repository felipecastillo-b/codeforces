/**
 *  author: castillodk
**/
#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define all(x) (x).begin(), (x).end()
#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);

int main() {
    fast_io;

    int t; cin >> t;

    while (t--) {
        string s; cin >> s;

        for (char &c : s)
        {
            c = tolower(c);
        }

        if (s == "yes")
        {
            cout << "YES" << "\n";
        } else {
            cout << "NO" << "\n";
        }
    }
    return 0;
}
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
        int a; cin >> a;
        int b; cin >> b;
        int c; cin >> c;

        if (a + b == c)
        {
            cout << "+" << "\n";
        } else {
            cout << "-" << "\n";
        }
        
    }
    return 0;
}
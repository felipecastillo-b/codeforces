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
        int x; cin >> x;
        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        cout << sum << '\n';
    }
    return 0;
}

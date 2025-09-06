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

    int n; cin >> n;
    int k; cin >> k;
    int l; cin >> l;
    int c; cin >> c;
    int d; cin >> d;
    int p; cin >> p;
    int nl; cin >> nl;
    int np; cin >> np;

    int totalMl = (k * l) / nl;
    int totalLimes = c * d;
    int totalSalt = p / np;

    if (totalLimes < n || totalSalt < n || totalMl == 0)
    {
        cout << 0;
        return 0;
    }
    
    int result = min({totalMl, totalLimes, totalSalt}) / n;
    cout << result;

    return 0;
}
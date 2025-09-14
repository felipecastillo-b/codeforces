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
    int crimes = 0;
    int polices = 0;

    while (t--) {
        int x; cin >> x;

        if(x == -1) {
            if(polices > 0) {
                polices--;
            } else {
                crimes++;
            }
        } else {
            polices+= x;
        }
    }
    cout << crimes;
    return 0;
}

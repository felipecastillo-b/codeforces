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
        int n; cin >> n;
        int x; cin >> x;
        int result = 0;
        int aux = 0;
        int prev = 0;

        for (int i = 0; i < n; i++)
        {
            int a; cin >> a;
            aux = a - prev;

            if (aux > result)
            {
                result = aux;
            }
            
            prev = a;
        }
        aux = (x - prev) * 2;

        if (aux > result)
        {
            cout << aux << "\n";
        } else {
            cout << result << "\n";
        }
        
    }
    return 0;
}
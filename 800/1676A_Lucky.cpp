#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define all(x) (x).begin(), (x).end()
#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);

int main() {
    fast_io;

    int t; cin >> t;

    while (t--) {
        string nums; cin >> nums;

        if (nums[0]+nums[1]+nums[2] == nums[3]+nums[4]+nums[5])
        {
            cout << "YES" << "\n";
        } else {
            cout << "NO" << "\n";
        }
        
    }
    return 0;
}
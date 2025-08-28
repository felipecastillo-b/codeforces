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
    int count = 0;
    int minNum = 0;
    int maxNum = 0;
    int aux = 0;

    if (t == 1)
    {
        int num; cin >> num;
        cout << count;
        return 0;
    }
    
    while (t--) {
        int num; cin >> num;
        

        if (aux == 0)
        {
            minNum = num;
            maxNum = num;
            aux++;
            continue;
        }

        if (num > maxNum)
        {
            count++;
            maxNum = num;
        } else if (num < minNum) {
            count++;
            minNum = num;
        }
    }

    cout << count;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define all(x) (x).begin(), (x).end()
#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);

int main() {
    fast_io;

    int t; cin >> t;

    while (t--) {
        vector<int> people(4);
        int count = 0;

        for (size_t i = 0; i < people.size(); i++)
        {
            cin >> people[i];

            if (i > 0 && people[0] < people[i])
            {
                count++;
            }
        }
        cout << count << "\n";
    }
    return 0;
}
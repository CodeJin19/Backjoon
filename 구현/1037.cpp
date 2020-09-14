#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int n, x;
    vector <int> list;

    cin >> n;

    for (int i = 0; i < n; ++i)
    {
        cin >> x;
        list.push_back(x);
    }

    sort(list.begin(), list.end());

    cout << list[0] * list[n - 1] << endl;
    return 0;
}

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    vector <int> arr;
    int x;

    for (int i = 0; i < 3; ++i)
    {
        cin >> x;
        arr.push_back(x);
    }

    sort(arr.begin(), arr.end());

    if (arr[2] - arr[1] == arr[1] - arr[0])
    {
        if (arr[0] == arr[1])
        {
            cout << arr[0] << endl;
        }
        else
        {
            cout << arr[0] + arr[1] - arr[2] << endl;
        }
    }
    else
    {
        cout << arr[2] + arr[0] - arr[1] << endl;
    }

    return 0;
}

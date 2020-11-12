#include <iostream>

using namespace std;

int main()
{
    int n, ans;

    cin >> n;

    while (n != 0)
    {
        if (n == 1)
        {
            ans = 1;
        }
        else
        {
            ans = n * n;
            ans -= (n - 1);
        }

        cout << n << " => " << ans << "\n";

        cin >> n;
    }

    return 0;
}

#include <iostream>

using namespace std;

int main()
{
    int n;
    long long total, a, b;

    cin >> n;

    while (n != 0)
    {
        cin >> a >> b;

        total = a - b;

        for (int i = 1; i < n; ++i)
        {
            cin >> a >> b;

            total *= a;
            total -= b;
        }

        cout << total << endl;

        cin >> n;
    }

    return 0;
}

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    double x;
    int a1, a2, tmp, b, n;

    cin >> b >> n;

    while (b != 0)
    {
        x = 1;
        x /= n;
        x = pow(b, x);

        tmp = x * 10;

        if (tmp % 10 == 0)
        {
            cout << tmp / 10 << "\n";
        }
        else
        {
            a1 = tmp / 10;
            a2 = a1 + 1;

            a1 = pow(a1, n);
            a2 = pow(a2, n);

            if (abs(a1 - b) < abs(a2 - b))
            {
                cout << tmp / 10 << "\n";
            }
            else
            {
                cout << tmp / 10 + 1 << "\n";
            }
        }

        cin >> b >> n;
    }

    return 0;
}

#include <iostream>

using namespace std;

int main()
{
    int a, b, cnt, x;
    bool carry;

    cin >> a >> b;

    while (a != 0 || b != 0)
    {
        cnt = 0;
        carry = false;

        while (a != 0 || b != 0)
        {
            x = a % 10 + b % 10;
            a /= 10;
            b /= 10;

            if (carry)
            {
                x++;
            }

            if (10 <= x)
            {
                cnt++;
                carry = true;
            }
            else
            {
                carry = false;
            }
        }

        cout << cnt << endl;

        cin >> a >> b;
    }

    return 0;
}

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int a, b, c, d, cnt, a2, b2, c2, d2;

    cin >> a >> b >> c >> d;

    while (a != 0 || b != 0 || c != 0 || d != 0)
    {
        cnt = 0;

        while (a != b || b != c || c != d)
        {
            a2 = abs(a - b);
            b2 = abs(b - c);
            c2 = abs(c - d);
            d2 = abs(d - a);

            cnt++;

            a = a2;
            b = b2;
            c = c2;
            d = d2;
        }

        cout << cnt << endl;

        cin >> a >> b >> c >> d;
    }

    return 0;
}

#include <iostream>
#include <cmath>

using namespace std;

int main ()
{
    int n, x1, x2, y1, y2;

    cin >> n;

    x1 = n / 4;
    y1 = n % 4;

    if (y1 == 0)
    {
        x1--;
        y1 = 3;
    }
    else
    {
        y1--;
    }

    cin >> n;

    x2 = n / 4;
    y2 = n % 4;

    if (y2 == 0)
    {
        x2--;
        y2 = 3;
    }
    else
    {
        y2--;
    }

    cout << abs(x1 - x2) + abs(y1 - y2) << endl;

    return 0;
}

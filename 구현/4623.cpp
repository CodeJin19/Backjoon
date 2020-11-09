#include <iostream>

using namespace std;

bool check(double x, double y, double l, double w)
{
    if (x <= l && y <= w)
    {
        return true;
    }

    if (x <= w && y <= l)
    {
        return true;
    }

    return false;
}

int main()
{
    double x, y, l, w, r;
    int ans, max, min;

    cin >> x >> y >> l >> w;

    while (x != 0 || y != 0 || l != 0 || w != 0)
    {
        r = 1;

        while (!check(x * r, y * r, l, w))
        {
            r -= 0.01;
        }

        cout << r * 100 << "%\n";

        cin >> x >> y >> l >> w;
    }

    return 0;
}

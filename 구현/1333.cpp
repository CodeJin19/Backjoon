#include <iostream>

using namespace std;

int main()
{
    int n, l, d, from, x, to, cnt = 1;
    bool flag = true;

    cin >> n >> l >> d;

    from = l;
    to = l + 5;
    x = 0;

    do
    {
        while (x < from)
        {
            x += d;
        }

        if (x < to)
        {
            cout << x << endl;
            flag = false;
            break;
        }
        else
        {
            from += (l + 5);
            to += (l + 5);
            cnt++;
        }

    } while (cnt <= n);

    if (flag)
    {   
        cout << x << endl;
    }

    return 0;
}

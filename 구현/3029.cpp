#include <iostream>
#include <string>

using namespace std;

int main()
{
    string str;
    int time1, time2, h, m, s;

    cin >> str;

    h = (int)(str[0] - '0');
    h *= 10;
    h += (int)(str[1] - '0');

    m = (int)(str[3] - '0');
    m *= 10;
    m += (int)(str[4] - '0');

    s = (int)(str[6] - '0');
    s *= 10;
    s += (int)(str[7] - '0');

    time1 = h;
    time1 *= 60;
    time1 += m;
    time1 *= 60;
    time1 += s;

    cin >> str;

    h = (int)(str[0] - '0');
    h *= 10;
    h += (int)(str[1] - '0');

    m = (int)(str[3] - '0');
    m *= 10;
    m += (int)(str[4] - '0');

    s = (int)(str[6] - '0');
    s *= 10;
    s += (int)(str[7] - '0');

    time2 = h;
    time2 *= 60;
    time2 += m;
    time2 *= 60;
    time2 += s;

    if (time1 < time2)
    {
        time2 -= time1;
        s = time2 % 60;
        time2 /= 60;
        m = time2 % 60;
        time2 /= 60;
        h = time2;
    }
    else
    {
        time2 += (24 * 60 * 60);
        time2 -= time1;
        s = time2 % 60;
        time2 /= 60;
        m = time2 % 60;
        time2 /= 60;
        h = time2;
    }

    if (h < 10)
    {
        cout << "0";
    }
    
    cout << h << ":";

    if (m < 10)
    {
        cout << "0";
    }

    cout << m << ":";

    if (s < 10)
    {
        cout << "0";
    }

    cout << s << endl;

    return 0;
}

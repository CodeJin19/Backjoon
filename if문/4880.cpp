#include <iostream>

using namespace std;

int main()
{
    int a1, a2, a3;

    cin >> a1 >> a2 >> a3;

    while (a1 != 0 || a2 != 0 || a3 != 0)
    {
        if (a2 * 2 == a1 + a3)
        {
            cout << "AP " << a2 + a3 - a1 << endl;
        }
        else
        {
            cout << "GP " << a2 / a1 * a3 << endl;
        }

        cin >> a1 >> a2 >> a3;
    }

    return 0;
}

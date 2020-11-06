#include <iostream>

using namespace std;

int main()
{
    int balance, x;
    char mode;
    bool flag;

    cin >> balance >> mode >> x;

    if (balance == 0 && mode == 'W' && x == 0)
    {
        flag = false;
    }
    else
    {
        flag = true;
    }

    while (flag)
    {
        if (mode == 'W')
        {
            balance -= x;

            if (-200 <= balance)
            {
                cout << balance << "\n";
            }
            else
            {
                cout << "Not allowed\n";
            }
        }
        else
        {
            balance += x;
            cout << balance << "\n";
        }

        cin >> balance >> mode >> x;

        if (balance == 0 && mode == 'W' && x == 0)
        {
            flag = false;
        }
        else
        {
            flag = true;
        }
    }

    return 0;
}

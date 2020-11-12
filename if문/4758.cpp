#include <iostream>

using namespace std;

int main()
{
    double speed;
    int weight, strength;
    bool flag;

    cin >> speed >> weight >> strength;

    while (speed != 0 || weight != 0 || strength != 0)
    {
        flag = false;

        if (speed <= 4.5 && 150 <= weight && 200 <= strength)
        {
            cout << "Wide Receiver";
            flag = true;
        }

        if (speed <= 6.0 && 300 <= weight && 500 <= strength)
        {
            if (flag)
            {
                cout << " ";
            }

            cout << "Lineman";
            flag = true;
        }

        if (speed <= 5.0 && 200 <= weight && 300 <= strength)
        {
            if (flag)
            {
                cout << " ";
            }

            cout << "Quarterback";
            flag = true;
        }

        if (!flag)
        {
            cout << "No positions";
        }
        cout << "\n";

        cin >> speed >> weight >> strength;
    }

    return 0;
}

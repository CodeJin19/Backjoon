#include <iostream>

using namespace std;

int main()
{
    int t, n, cnt;
    char x, y;

    cin >> t;

    for (int itr = 0; itr < t; ++itr)
    {
        cin >> n;

        cnt = 0;

        for (int i = 0; i < n; ++i)
        {
            cin >> x >> y;

            switch (x)
            {
            case 'R':
                switch (y)
                {
                case 'R':
                    break;
                case 'P':
                    cnt--;
                    break;
                case 'S':
                    cnt++;
                    break;
                }
                break;
            case 'P':
                switch (y)
                {
                case 'R':
                    cnt++;
                    break;
                case 'P':
                    break;
                case 'S':
                    cnt--;
                    break;
                }
                break;
            case 'S':
                switch (y)
                {
                case 'R':
                    cnt--;
                    break;
                case 'P':
                    cnt++;
                    break;
                case 'S':
                    break;
                }
                break;
            }
        }

        if (0 < cnt)
        {
            cout << "Player 1\n";
        }
        else if (cnt == 0)
        {
            cout << "TIE\n";
        }
        else
        {
            cout << "Player 2\n";
        }
    }

    return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int o, w, n, t;
	char e;
    bool isDead;

	cin >> o >> w;

	t = 0;

	while (o != 0 || w != 0)
	{
		t++;
        isDead = false;

		cin >> e >> n;

		while (e != '#' || n != 0)
		{
			if (e == 'F')
			{
				w += n;
			}
			else
			{
				w -= n;
			}

			if (w <= 0)
			{
				isDead = true;
			}

			cin >> e >> n;
		}

        if(isDead || w <= 0)
        {
            cout << t << " RIP\n";
        }
		else if (o / 2 < w && w < 2 * o)
		{
			cout << t << " :-)\n";
		}
		else
		{
			cout << t << " :-(\n";
		}

		cin >> o >> w;
	}

	return 0;
}

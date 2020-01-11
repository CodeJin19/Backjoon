#include <iostream>

using namespace std;

int main()
{
	int n, x, r;
	int ans = 1;

	cin >> n >> x;

	if (x == 0)
	{
		cout << 1 << endl;
	}
	else if (n == 1)
	{
		cout << 1 << endl;
	}
	else
	{
		if (x < (n - x))
		{
			for (int i = 0; i < x; i++)
			{
				ans *= (n - i);
				ans /= (1 + i);
			}
		}
		else
		{
			x = n - x;

			for (int i = 0; i < x; i++)
			{
				ans *= (n - i);
				ans /= (1 + i);
			}
		}

		cout << ans << endl;
	}

	return 0;
}

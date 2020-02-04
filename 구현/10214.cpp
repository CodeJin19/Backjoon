#include <iostream>

using namespace std;

int main()
{
	int t, y, k, a, b;

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		y = 0;
		k = 0;

		for (int j = 0; j < 9; j++)
		{
			cin >> a >> b;

			y += a;
			k += b;
		}

		if (y == k)
		{
			cout << "Draw\n";
		}
		else if (k < y)
		{
			cout << "Yonsei\n";
		}
		else
		{
			cout << "Korea\n";
		}
	}

	return 0;
}

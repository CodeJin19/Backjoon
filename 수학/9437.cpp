#include <iostream>

using namespace std;

int main()
{
	int n, p, idx, x;

	cin >> n;

	while (n != 0)
	{
		cin >> p;

		if (p <= (n / 2))
		{
			idx = (p - 1) / 2;
		}
		else
		{
			idx = n - p;
			idx /= 2;
		}

		x = idx * 2 + 1;

		if (x != p)
		{
			cout << x << " ";
		}

		x++;

		if (x != p)
		{
			cout << x << " ";
		}

		x = n - (idx * 2) - 1;

		if (x != p)
		{
			cout << x << " ";
		}

		x++;

		if (x != p)
		{
			cout << x << " ";
		}

		cout << "\n";

		cin >> n;
	}
	
	return 0;
}

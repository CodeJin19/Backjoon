#include <iostream>

using namespace std;

int main()
{
	int n, x, y, a = 100, b = 100;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;

		if (x < y)
		{
			a -= y;
		}
		else if (y < x)
		{
			b -= x;
		}
	}

	cout << a << endl << b << endl;

	cin >> n;

	return 0;
}

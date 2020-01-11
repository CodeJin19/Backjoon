#include <iostream>

using namespace std;

int main()
{
	int r, b, l, w;

	cin >> r >> b;

	if (b == 1)
	{
		cout << "3 3" << endl;
	}

	for (int i = 1; i <= b / 2; i++)
	{
		if (b % i == 0)
		{
			w = i;
			l = b / i;

			if ((l + 2) * (w + 2) == r + b)
			{
				cout << l + 2 << " " << w + 2 << endl;
				break;
			}
		}
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int n, b, h, w, p, a, x;
	int min = 2100000000;

	cin >> n >> b >> h >> w;

	for (int i = 0; i < h; i++)
	{
		cin >> p;

		for (int j = 0; j < w; j++)
		{
			cin >> a;

			if (n <= a)
			{
				x = n * p;

				if (x <= b && x < min)
				{
					min = x;
				}
			}
		}
	}

	if (min == 2100000000)
	{
		cout << "stay home\n";
	}
	else
	{
		cout << min << endl;
	}

	return 0;
}

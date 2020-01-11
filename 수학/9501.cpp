#include <iostream>

using namespace std;

int main()
{
	int t, n, d, v, f, c, cnt;
	double maxlen;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n >> d;
		cnt = 0;

		for (int i = 0; i < n; i++)
		{
			cin >> v >> f >> c;

			maxlen = f;
			maxlen /= c;
			maxlen *= v;

			if (d <= maxlen)
			{
				cnt++;
			}
		}

		cout << cnt << "\n";
	}

	return 0;
}

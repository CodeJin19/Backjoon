#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> timeline;
	int max = 0, a, b, c, d, p, m, n;

	cin >> a >> b >> c >> d >> p >> m >> n;

	if (p < m)
	{
		if (m < n)
		{
			max = n;
		}
		else
		{
			max = m;
		}
	}
	else
	{
		if (p < n)
		{
			max = n;
		}
		else
		{
			max = p;
		}
	}

	for (int i = 0; i <= max; i++)
	{
		timeline.push_back(0);
	}

	for (int i = 1; i <= max;)
	{
		int j = 0;

		while (j < a && i + j <= max)
		{
			timeline[i + j] += 1;
			j++;
		}

		i += a;
		i += b;
	}

	for (int i = 1; i <= max;)
	{
		int j = 0;

		while (j < c && i + j <= max)
		{
			timeline[i + j] += 1;
			j++;
		}

		i += c;
		i += d;
	}

	cout << timeline[p] << endl << timeline[m] << endl << timeline[n] << endl;

	return 0;
}

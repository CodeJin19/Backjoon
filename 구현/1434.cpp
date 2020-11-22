#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> a;
	int n, m, x, total, idx;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		a.push_back(x);
	}

	total = 0;
	idx = 0;

	for (int i = 0; i < m; i++)
	{
		cin >> x;

		if (x <= a[idx])
		{
			a[idx] -= x;
		}
		else
		{
			while (a[idx] < x)
			{
				total += a[idx];
				idx++;
			}

			a[idx] -= x;
		}
	}

	for (; idx < n; idx++)
	{
		total += a[idx];
	}

	cout << total << endl;

	return 0;
}

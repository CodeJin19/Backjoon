#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> cnt;
	int n, m, l, idx, total;

	cin >> n >> m >> l;

	for (int i = 0; i <= n; i++)
	{
		cnt.push_back(0);
	}

	idx = 1;
	cnt[idx] = 1;
	total = 0;

	while (1)
	{
		if (cnt[idx] % 2 == 0)
		{
			idx -= l;

			if (idx < 1)
			{
				idx += n;
			}
		}
		else
		{
			idx += l;

			if (n < idx)
			{
				idx -= n;
			}
		}

		cnt[idx] += 1;
		total++;

		if (cnt[idx] == m)
		{
			cout << total << endl;
			break;
		}
	}

	return 0;
}

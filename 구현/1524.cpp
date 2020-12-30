#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> jun, bi;
	int t, n, m, x, jdx, bdx;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n >> m;

		jun.clear();
		bi.clear();

		for (int i = 0; i < n; i++)
		{
			cin >> x;
			jun.push_back(x);
		}

		for (int i = 0; i < m; i++)
		{
			cin >> x;
			bi.push_back(x);
		}

		sort(jun.begin(), jun.end());
		sort(bi.begin(), bi.end());

		jdx = 0;
		bdx = 0;

		while (jdx < n && bdx < m)
		{
			if (jun[jdx] < bi[bdx])
			{
				jdx++;
			}
			else if (jun[jdx] == bi[bdx])
			{
				bdx++;
			}
			else
			{
				bdx++;
			}
		}

		if (bdx == m)
		{
			cout << "S\n";
		}
		else
		{
			cout << "B\n";
		}
	}

	return 0;
}

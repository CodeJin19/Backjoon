#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int main()
{
	vector <int> cnt;

	int t, x, y;

	cin >> t;

	for (int i = 0; i < 5; i++)
	{
		cnt.push_back(0);
	}

	for (int i = 0; i < t; i++)
	{
		cin >> x >> y;

		if (x == 0 || y == 0)
		{
			cnt[4]++;
		}
		else if (0 < x)
		{
			if (0 < y)
			{
				cnt[0]++;
			}
			else
			{
				cnt[3]++;
			}
		}
		else
		{
			if (0 < y)
			{
				cnt[1]++;
			}
			else
			{
				cnt[2]++;
			}
		}
	}

	for (int i = 0; i < 4; i++)
	{
		cout << "Q" << i + 1 << ": " << cnt[i] << endl;
	}
	cout << "AXIS: " << cnt[4] << endl;

	return 0;
}

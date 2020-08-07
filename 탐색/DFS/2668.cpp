#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n, x, prev, now, len, from;
	bool flag;
    vector <vector <int>> list;
    vector <bool> cache;
	vector <int> tmp;
	vector <int> ans;

	cin >> n;

	for (int i = 0; i <= n; ++i)
	{
		tmp.push_back(i);
		cache.push_back(true);
	}

	list.push_back(tmp);
	tmp.clear();
	tmp.push_back(0);

	for (int i = 0; i < n; ++i)
	{
		cin >> x;
		tmp.push_back(x);
	}

	list.push_back(tmp);

	for (int i = 1; i <= n; ++i)
	{
		if (cache[i])
		{
			tmp.clear();
			prev = i;
			tmp.push_back(list[0][prev]);

			while (1)
			{
				now = list[1][prev];
				len = tmp.size();
				flag = false;

				if (!cache[now])
					break;

				for (int j = 0; j < len; ++j)
				{
					if (now == tmp[j])
					{
						from = j;
						flag = true;
						break;
					}
				}

				if (flag)
				{
					for (int j = from; j < len; ++j)
					{
						ans.push_back(tmp[j]);
						cache[tmp[j]] = false;
					}
					break;
				}
				else
				{
					tmp.push_back(now);
					prev = now;
				}
			}
		}
	}

	sort(ans.begin(), ans.end());
	len = ans.size();

	cout << len << endl;

	for (int i = 0; i < len; ++i)
	{
		cout << ans[i] << "\n";
	}

	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> total;
	vector <int> tmp;
	vector <int> list;
	vector <bool> cache;
	int t, n, x, next;
	bool flag;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		total.clear();
		list.clear();
		cache.clear();

		cin >> n;

		list.push_back(0);
		cache.push_back(false);

		for (int i = 0; i < n; i++)
		{
			cin >> x;
			list.push_back(x);
			cache.push_back(false);
		}

		for (int i = 1; i <= n; i++)
		{
			if (!cache[i])
			{
				tmp.clear();
				tmp.push_back(i);
				cache[i] = true;
				next = list[i];
				flag = true;

				while (flag)
				{
					for (int j = 0; j < tmp.size(); j++)
					{
						if (next == tmp[j])
						{
							flag = false;
							break;
						}
					}

					if (flag)
					{
						tmp.push_back(next);
						cache[next] = true;
						next = list[next];
					}
				}

				total.push_back(tmp);
			}
		}

		cout << total.size() << "\n";
	}

	return 0;
}

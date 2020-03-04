#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <int> all;
vector <int> arr;
vector <bool> cache;
int n, m;

void solve(int present)
{
	if (present == m)
	{
		for (int i = 0; i < m; i++)
			cout << arr[i] << " ";
		cout << "\n";

		return;
	}
	else if (present == 0)
	{
		for (int i = 1; i <= n; i++)
		{
			cache[i] = true;
			arr[present] = all[i];
			solve(present + 1);
			cache[i] = false;
		}
	}
	else
	{
		for (int i = 1; i <= n; i++)
		{
			if (!cache[i] && arr[present - 1] < all[i])
			{
				cache[i] = true;
				arr[present] = all[i];
				solve(present + 1);
				cache[i] = false;
			}
		}
	}
}

int main()
{
	int x;

	cin >> n >> m;

	all.push_back(0);

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		all.push_back(x);
	}

	sort(all.begin(), all.end());

	for (int i = 0; i <= n; i++)
	{
		arr.push_back(0);
		cache.push_back(false);
	}

	solve(0);

	return 0;
}

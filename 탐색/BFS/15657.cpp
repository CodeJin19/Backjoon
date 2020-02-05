#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <int> list;
vector <int> cache;
int n, m;

void solve(int idx)
{
	if (idx == m + 1)
	{
		for (int i = 1; i <= m; i++)
		{
			cout << cache[i] << " ";
		}
		cout << "\n";

		return;
	}

	for (int i = 0; i < n; i++)
	{
		if (cache[idx - 1] <= list[i])
		{
			cache[idx] = list[i];
			solve(idx + 1);
		}
	}
}

int main()
{
	int x;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		list.push_back(x);
	}

	for (int i = 0; i < m + 1; i++)
	{
		cache.push_back(0);
	}

	sort(list.begin(), list.end());

	solve(1);

	return 0;
}

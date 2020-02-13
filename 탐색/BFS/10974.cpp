#include <iostream>
#include <vector>

using namespace std;

vector <int> list;
vector <bool> cache;
int n;

void solve(int idx)
{
	if (idx == n)
	{
		for (int i = 0; i < n; i++)
		{
			cout << list[i] << " ";
		}

		cout << "\n";

		return;
	}

	for (int i = 1; i <= n; i++)
	{
		if (!cache[i])
		{
			cache[i] = true;
			list[idx] = i;
			solve(idx + 1);
			cache[i] = false;
		}
	}
}

int main()
{
	cin >> n;

	for (int i = 0; i <= n; i++)
	{
		cache.push_back(false);
		list.push_back(0);
	}

	solve(0);

	return 0;
}

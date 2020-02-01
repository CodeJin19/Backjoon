#include <iostream>
#include <vector>

using namespace std;

vector <int> arr;
vector <int> cache;
int n, m;

void solve(int present)
{
	if (present == m)
	{
		for (int i = 1; i <= n; i++)
		{
			if (cache[i] == 0)
			{
				arr[present] = i;

				for (int j = 1; j <= m; j++)
				{
					cout << arr[j] << " ";
				}
				cout << "\n";
			}
		}

		return;
	}

	for (int i = 1; i <= n; i++)
	{
		if (cache[i] == 0)
		{
			cache[i] = 1;
			arr[present] = i;
			solve(present + 1);
			cache[i] = 0;
		}
	}
}

int main()
{
	cin >> n >> m;

	for (int i = 0; i <= n; i++)
	{
		arr.push_back(0);
	}

	for (int i = 0; i <= n; i++)
	{
		cache.push_back(0);
	}

	solve(1);

	return 0;
}

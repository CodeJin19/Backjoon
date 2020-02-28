#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <int> arr;
vector <int> cache;
vector <int> num;
int n, m;

void solve(int present)
{
	if (present == m)
	{
		for (int i = 1; i <= n; i++)
		{
			if (cache[i] == 0)
			{
				arr[present] = num[i];

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
			arr[present] = num[i];
			solve(present + 1);
			cache[i] = 0;
		}
	}
}

int main()
{
	int x;

	cin >> n >> m;

	for (int i = 0; i <= n; i++)
	{
		arr.push_back(0);
		cache.push_back(0);
	}

	num.push_back(0);
	for (int i = 0; i < n; i++)
	{
		cin >> x;
		num.push_back(x);
	}

	sort(num.begin(), num.end());

	solve(1);
    
	return 0;
}

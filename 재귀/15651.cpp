#include <iostream>
#include <vector>

using namespace std;

vector <int> arr;
int n, m;

void solve(int present)
{
	if (present == m)
	{
		for (int i = 1; i <= n; i++)
		{
			arr[present] = i;

			for (int j = 1; j <= m; j++)
			{
				cout << arr[j] << " ";
			}
			cout << "\n";
		}

		return;
	}

	for (int i = 1; i <= n; i++)
	{
		arr[present] = i;
		solve(present + 1);
	}
}

int main()
{
	cin >> n >> m;

	for (int i = 0; i <= n; i++)
	{
		arr.push_back(0);
	}

	solve(1);

	return 0;
}

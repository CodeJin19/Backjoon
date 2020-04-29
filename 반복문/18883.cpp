#include <iostream>

using namespace std;

int main()
{
	int n, m, cnt = 1;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cout << cnt;

		for (int j = 1; j < m; j++)
		{
			cnt++;

			cout << " " << cnt;
		}

		cnt++;

		cout << "\n";
	}

	return 0;
}

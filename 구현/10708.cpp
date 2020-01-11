#include <iostream>

using namespace std;

int main()
{
	int score[110];
	int target[110];
	int n, m, x, cnt;

	cin >> n >> m;

	for (int i = 1; i <= n; i++)
	{
		score[i] = 0;
	}

	for (int i = 1; i <= m; i++)
	{
		cin >> target[i];
	}

	for (int i = 1; i <= m; i++)
	{
		cnt = 0;

		for (int j = 1; j <= n; j++)
		{
			cin >> x;

			if (x == target[i])
			{
				score[j] += 1;
			}
			else
			{
				cnt++;
			}
		}

		score[target[i]] += cnt;
	}

	for (int i = 1; i <= n; i++)
	{
		cout << score[i] << "\n";
	}

	return 0;
}

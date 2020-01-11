#include <iostream>

using namespace std;

int main()
{
	int n, m, idx, max, mdx;
	int cost[1010];
	int criteria[1010];
	int vote[1010];

	cin >> n >> m;

	for (int i = 1; i <= n; i++)
	{
		cin >> cost[i];
		vote[i] = 0;
	}

	for (int i = 1; i <= m; i++)
	{
		cin >> criteria[i];
	}

	max = 0;

	for (int i = 1; i <= m; i++)  //m명의 심사위원들의 투표
	{
		idx = 1;

		while (idx <= n)  //1번 경기부터 점검
		{
			if (cost[idx] <= criteria[i])  //idx번째 경기의 비용이 i번째 심사위원의 기준 이하이면 투표
			{
				break;
			}

			idx++;
		}

		vote[idx] += 1;

		if (max < vote[idx])
		{
			max = vote[idx];
			mdx = idx;
		}
	}

	cout << mdx << endl;

	return 0;
}

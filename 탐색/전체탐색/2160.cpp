#include <iostream>
#include <vector>

using namespace std;

vector <vector <vector <char>>> list;
int minVal = 2112345678;

int getCnt(int x, int y)
{
	int ret = 0;

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 7; j++)
		{
			if(list[x][i][j] != list[y][i][j])
			{
				if (minVal < ++ret)
				{
					return 2112345678;
				}
			}
		}
	}

	return ret;
}

int main()
{
	vector <vector <char>> paint;
	vector <char> tmp;
	int n, ans1, ans2, cnt;

	cin >> n;

	for (int i = 0; i < 7; i++)
	{
		tmp.push_back('.');
	}

	for (int i = 0; i < 5; i++)
	{
		paint.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		list.push_back(paint);

		for (int j = 0; j < 5; j++)
		{
			for (int k = 0; k < 7; k++)
			{
				cin >> list[i][j][k];
			}
		}
	}

	for (int i = 0; i < n - 1; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			cnt = getCnt(i, j);

			if (cnt < minVal)
			{
				minVal = cnt;
				ans1 = i;
				ans2 = j;
			}
		}
	}

	cout << ans1 + 1 << " " << ans2 + 1 << "\n";

	return 0;
}

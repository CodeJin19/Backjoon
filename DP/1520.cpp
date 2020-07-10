#include <iostream>
#include <vector>

using namespace std;

vector <vector <int>> fld;
vector <vector <int>> cnt;
int m, n;

int solve(int y, int x)
{
	int & ret = cnt[y][x];

	if (ret != -1)
		return ret;

	ret = 0;

	if (1 < y && fld[y - 1][x] < fld[y][x])
		ret += solve(y - 1, x);

	if (y < m && fld[y + 1][x] < fld[y][x])
		ret += solve(y + 1, x);

	if (1 < x && fld[y][x - 1] < fld[y][x])
		ret += solve(y, x - 1);

	if (x < n && fld[y][x + 1] < fld[y][x])
		ret += solve(y, x + 1);

	return ret;
}

int main()
{
	vector <int> tmp;
	int x;

	cin >> m >> n;

	for (int i = 0; i < n + 2; i++)
		tmp.push_back(-1);

	for (int i = 0; i < m + 2; i++)
	{
		fld.push_back(tmp);
		cnt.push_back(tmp);
	}

	for (int i = 0; i < n + 2; i++)
	{
		cnt[0][i] = 0;
		cnt[m + 1][i] = 0;
	}

	for (int i = 0; i < m + 2; i++)
	{
		cnt[i][0] = 0;
		cnt[i][n + 1] = 0;
	}

	for (int i = 1; i <= m; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			cin >> fld[i][j];
		}
	}

	cnt[m][n] = 1;
	
	cout << solve(1, 1) << endl;

	return 0;
}

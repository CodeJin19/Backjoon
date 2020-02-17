#include <iostream>
#include <vector>

using namespace std;

vector <vector <int>> field;
vector <vector <int>> cache;
int n, m;

int max(int x, int y)
{
	if (x < y)
		return y;
	else
		return x;
}

int solve(int y, int x)
{
	int& ret = cache[y][x];

	if (ret != -1)
		return ret;

	if (y == n && x == m)
		return field[y][x];

	ret = max(solve(y + 1, x), solve(y, x + 1));
	ret = max(ret, solve(y + 1, x + 1)) + field[y][x];

	return ret;
}

int main()
{
	vector <int> tmp;
	int x;

	cin >> n >> m;

	for (int j = 0; j <= m; j++)
		tmp.push_back(0);

	field.push_back(tmp);

	for (int i = 0; i < n; i++)
	{
		tmp.clear();
		tmp.push_back(0);

		for (int j = 0; j < m; j++)
		{
			cin >> x;

			tmp.push_back(x);
		}

		field.push_back(tmp);
	}

	tmp.clear();

	for (int i = 0; i <= m + 1; i++)
		tmp.push_back(-2100000000);

	for (int i = 0; i <= n + 1; i++)
		cache.push_back(tmp);

	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= m; j++)
			cache[i][j] = -1;

	cout << solve(1, 1) << endl;

	return 0;
}

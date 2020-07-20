#include <iostream>
#include <vector>

using namespace std;

int n;
vector <vector <int>> fld;
vector <vector <int>> cache;

int getMax(int x, int y)
{
	if (x < y)
		return y;
	else
		return x;
}

int solve(int i, int j)
{

	if (i == 0 || n < i)
		return -1;

	if (j == 0 || n < j)
		return -1;

	int & ret = cache[i][j];
	int up = 0, down = 0, left = 0, right = 0;

	if (ret != -1)
		return ret;

	ret = 1;

	if (1 < i && fld[i][j] < fld[i - 1][j])
		up = solve(i - 1, j);

	if (i < n && fld[i][j] < fld[i + 1][j])
		down = solve(i + 1, j);

	if (1 < j && fld[i][j] < fld[i][j - 1])
		left = solve(i, j - 1);

	if (j < n && fld[i][j] < fld[i][j + 1])
		right = solve(i, j + 1);

	ret += getMax(up, getMax(down, getMax(left,right)));

	return ret;
}

int main()
{
	int x, ans = 0;
	vector <int> tmp;

	cin >> n;

	for (int i = 0; i <= n + 1; i++)
		tmp.push_back(0);

	for (int i = 0; i <= n + 1; i++)
		fld.push_back(tmp);

	tmp.clear();

	for (int i = 0; i <= n + 1; i++)
		tmp.push_back(-1);

	for (int i = 0; i <= n + 1; i++)
		cache.push_back(tmp);

	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++)
			scanf("%d", &fld[i][j]);

	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++)
			ans = getMax(solve(i, j), ans);

	cout << ans << endl;
	return 0;
}

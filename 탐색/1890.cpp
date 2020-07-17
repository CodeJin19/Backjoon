#include <iostream>
#include <stdio.h>
#include <vector>

using namespace std;

int n;
vector <vector <int>> fld;
vector <vector <long long>> cache;

long long solve(int y, int x)
{
	if (n <= y || n <= x)
		return 0;

	long long& ret = cache[y][x];

	if (ret != -1)
		return ret;

	ret = 0;
	ret += solve(y + fld[y][x], x);
	ret += solve(y, x + fld[y][x]);

	return ret;
}

int main()
{
	int x;
	vector <int> tmp;
	vector <long long> dmp;

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			scanf("%d", &x);
			tmp.push_back(x);
		}

		fld.push_back(tmp);
	}

	tmp.clear();

	for (int i = 0; i < n; i++)
		dmp.push_back(-1);

	for (int i = 0; i < n; i++)
		cache.push_back(dmp);

	cache[n - 1][n - 1] = 1;
	solve(0, 0);
	cout << cache[0][0] << endl;

	return 0;
}

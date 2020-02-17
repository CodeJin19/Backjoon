#include <iostream>
#include <vector>

using namespace std;

vector <vector <int>> field;
vector <vector <int>> cache;
int n;

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

	if (y == n)
		return field[y][x];

	ret = max(solve(y + 1, x), solve(y + 1, x + 1)) + field[y][x];

	return ret;
}

int main()
{
	vector <int> tmp;
	int x;

	cin >> n;

	for (int i = 0; i <= n; i++)
	{
		tmp.clear();
		tmp.push_back(0);

		for (int j = 0; j < i; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		tmp.push_back(0);
		field.push_back(tmp);
	}

	for (int i = 0; i <= n; i++)
	{
		tmp.clear();
		tmp.push_back(-2100000000);

		for (int j = 0; j < i; j++)
			tmp.push_back(-1);

		tmp.push_back(-2100000000);
		cache.push_back(tmp);
	}

	cout << solve(1, 1) << endl;

	return 0;
}

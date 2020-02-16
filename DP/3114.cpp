#include <iostream>
#include <vector>

using namespace std;

vector <vector <int>> fieldA;
vector <vector <int>> fieldB;
vector <vector <int>> cache;
int r, c;

int getMax(int x, int y)
{
	if (x < y)
		return y;
	else
		return x;
}

int solve(int y, int x)
{
	int& ret = cache[y][x];
	int a = 0, b = 0;

	if (ret != -1)
		return ret;

	a = fieldA[y + 1][x];
	b = fieldB[y][x + 1];

	ret = solve(y + 1, x + 1) + a + b;
	ret = getMax(ret, solve(y + 1, x) + b);
	ret = getMax(ret, solve(y, x + 1) + a);

	return ret;
}

int main()
{
	vector <int> tmp;
	char s;

	cin >> r >> c;

	for (int i = 0; i <= c + 1; i++)
		tmp.push_back(0);

	for (int i = 0; i <= r + 1; i++)
	{
		fieldA.push_back(tmp);
		fieldB.push_back(tmp);
	}

	tmp.clear();

	for (int i = 0; i <= c + 1; i++)
		tmp.push_back(-1);

	for (int i = 0; i <= r + 1; i++)
		cache.push_back(tmp);

	for (int i = 1; i <= r + 1; i++)
		cache[i][c + 1] = -2100000000;

	for (int i = 1; i <= c + 1; i++)
		cache[r + 1][i] = -2100000000;

	cache[r][c] = 0;

	for (int i = 1; i <= r; i++)
	{
		for (int j = 1; j <= c; j++)
		{
			cin >> s;

			if (s == 'A')
			{
				cin >> fieldA[i][j];
			}
			else
			{
				cin >> fieldB[i][j];
			}

		}
	}

	for (int i = 1; i <= c; i++)
	{
		for (int j = r - 1; 1 <= j; j--)
		{
			fieldA[j][i] += fieldA[j + 1][i];
		}
	}

	for (int i = 1; i <= r; i++)
	{
		for (int j = c - 1; 1 <= j; j--)
		{
			fieldB[i][j] += fieldB[i][j + 1];
		}
	}

	cout << solve(1, 1) << endl;
	
	return 0;
}

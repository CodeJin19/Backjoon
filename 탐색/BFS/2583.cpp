#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <vector <bool>> field;
vector <int> area;
int m, n;

int bfs(int y, int x)
{
	if (y <= 0 || m < y || x <= 0 || n < x)
		return 0;
	
	field[y][x] = false;
	int size = 1;

	if (field[y - 1][x])
	{
		size += bfs(y - 1, x);
	}

	if (field[y + 1][x])
	{
		size += bfs(y + 1, x);
	}

	if (field[y][x - 1])
	{
		size += bfs(y, x - 1);
	}

	if (field[y][x + 1])
	{
		size += bfs(y, x + 1);
	}

	return size;
}

int solve()
{
	int ret = 0;

	for (int i = 1; i <= m; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			if (field[i][j])
			{
				area.push_back(bfs(i, j));
				ret++;
			}
		}
	}

	return ret;
}

int main()
{
	int x1, y1, x2, y2, k;
	vector <bool> tmp;

	cin >> m >> n >> k;

	for (int i = 0; i <= n + 1; i++)
		tmp.push_back(true);

	for (int i = 0; i <= m + 1; i++)
		field.push_back(tmp);

	for (int i = 0; i < k; i++)
	{
		cin >> x1 >> y1 >> x2 >> y2;

		x1++;
		y1++;

		for (int j = y1; j <= y2; j++)
			for (int k = x1; k <= x2; k++)
				field[j][k] = false;
	}

	cout << solve() << endl;

	sort(area.begin(), area.end());

	for (int i = 0; i < area.size(); i++)
		cout << area[i] << " ";

	return 0;
}

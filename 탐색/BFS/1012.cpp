#include <iostream>
#include <vector>

using namespace std;

vector <vector <int>> fld;

void dfs(int h, int w, int y, int x)
{
	fld[y][x] = -1;

	if (0 < y && fld[y - 1][x] == 1)
	{
		dfs(h, w, y - 1, x);
	}

	if (0 < x && fld[y][x - 1] == 1)
	{
		dfs(h, w, y, x - 1);
	}

	if (y < h - 1 && fld[y + 1][x] == 1)
	{
		dfs(h, w, y + 1, x);
	}

	if (x < w - 1 && fld[y][x + 1] == 1)
	{
		dfs(h, w, y, x + 1);
	}
}

int getCnt(int h, int w)
{
	int cnt = 0;

	for (int y = 0; y < h; y++)
	{
		for (int x = 0; x < w; x++)
		{
			if (fld[y][x] == 1)
			{
				dfs(h, w, y, x);
				cnt++;
			}
		}
	}

	return cnt;
}

int main()
{
	vector <int> tmp;
	int t, n, x, y, h, w;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> w >> h >> n;

		tmp.clear();
		fld.clear();

		for (int i = 0; i < w; i++)
		{
			tmp.push_back(0);
		}

		for (int i = 0; i < h; i++)
		{
			fld.push_back(tmp);
		}

		for (int i = 0; i < n; ++i)
		{
			cin >> x >> y;

			fld[y][x] = 1;
		}

		cout << getCnt(h, w) << "\n";
	}

	return 0;
}

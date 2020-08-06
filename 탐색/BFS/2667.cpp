#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <queue>

using namespace std;

int n, apt = 0;
vector <string> fld;
vector <int> cntList;

int bfs(int y, int x)
{
	int cnt = 0;
	queue <int> xlist;
	queue <int> ylist;

	fld[y][x] = '0';
	cnt++;

	xlist.push(x - 1);
	ylist.push(y);
	xlist.push(x + 1);
	ylist.push(y);
	xlist.push(x);
	ylist.push(y - 1);
	xlist.push(x);
	ylist.push(y + 1);

	while (!xlist.empty())
	{
		x = xlist.front();
		y = ylist.front();
		xlist.pop();
		ylist.pop();

		if (x < 0 || n <= x || y < 0 || n <= y)
			continue;

		if (fld[y][x] != '0')
		{
			cnt++;
			fld[y][x] = '0';

			xlist.push(x - 1);
			ylist.push(y);
			xlist.push(x + 1);
			ylist.push(y);
			xlist.push(x);
			ylist.push(y - 1);
			xlist.push(x);
			ylist.push(y + 1);
		}
	}

	return cnt;
}

int main()
{
	string s;
	int x;

	cin >> n;

	for (int i = 0; i < n; ++i)
	{
		cin >> s;
		fld.push_back(s);
	}

	for (int i = 0; i < n; ++i)
	{
		for (int j = 0; j < n; ++j)
		{
			if (fld[i][j] != '0')
			{
				x = bfs(i, j);
				cntList.push_back(x);
				apt++;
			}
		}
	}

	cout << apt << "\n";

	sort(cntList.begin(), cntList.end());

	for (int i = 0; i < apt; ++i)
		cout << cntList[i] << "\n";

	return 0;
}

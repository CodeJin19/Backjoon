#include <iostream>
#include <vector>

using namespace std;

int white = 0, blue = 0;
vector <vector <int>> fld;
vector <int> tmp;

void solve(int len, int x, int y)
{
	int key = fld[x][y];
	bool flag = true;

	for (int i = x; i < x + len; i++)
	{
		for (int j = y; j < y + len; j++)
		{
			if (fld[i][j] != key)
			{
				flag = false;
				i = x + len;
				break;
			}
		}
	}

	if (flag)
	{
		if (key == 1)
		{
			blue++;
		}
		else
		{
			white++;
		}
	}
	else
	{
		solve(len / 2, x, y);
		solve(len / 2, x, y + (len / 2));
		solve(len / 2, x + (len / 2), y);
		solve(len / 2, x + (len / 2), y + (len / 2));
	}
}

int main()
{
	int n, x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		fld.push_back(tmp);
	}

	solve(n, 0, 0);

	cout << white << endl << blue<< endl;

	return 0;
}

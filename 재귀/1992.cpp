#include <iostream>
#include <vector>

using namespace std;

vector <vector <char>> fld;
int n;

bool check(int xstart, int xend, int ystart, int yend)
{
	char x = fld[ystart][xstart];

	for (int i = ystart; i < yend; i++)
	{
		for (int j = xstart; j < xend; j++)
		{
			if (fld[i][j] != x)
			{
				return false;
			}
		}
	}

	return true;
}

void solve(int xstart, int xend, int ystart, int yend, int len)
{
	if (check(xstart, xend, ystart, yend))
	{
		cout << fld[ystart][xstart];
	}
	else
	{
		cout << "(";

		solve(xstart, xstart + len / 2, ystart, ystart + len / 2, len / 2);
		solve(xstart + len / 2, xend, ystart, ystart + len / 2, len / 2);
		solve(xstart, xstart + len / 2, ystart + len / 2, yend, len / 2);
		solve(xstart + len / 2, xend, ystart + len / 2, yend, len / 2);

		cout << ")";
	}
}

int main()
{
	vector <char> tmp;
	char x;

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

	solve(0, n, 0, n, n);

	cout << endl;

	return 0;
}

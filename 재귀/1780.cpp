#include <iostream>
#include <vector>

using namespace std;

vector <vector <int>> fld;
int n, yin = 0, yang = 0, zero = 0;

bool check(int xstart, int xend, int ystart, int yend)
{
	int x = fld[ystart][xstart];

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
		switch (fld[ystart][xstart])
		{
		case -1:
			yin++;
			break;
		case 0:
			zero++;
			break;
		case 1:
			yang++;
			break;
		}
	}
	else
	{
		len /= 3;

		solve(xstart, xstart + len, ystart, ystart + len, len);
		solve(xstart + len, xstart + (2 * len), ystart, ystart + len, len);
		solve(xstart + (2 * len), xend, ystart, ystart + len, len);
		solve(xstart, xstart + len, ystart + len, ystart + (2 * len), len);
		solve(xstart + len, xstart + (2 * len), ystart + len, ystart + (2 * len), len);
		solve(xstart + (2 * len), xend, ystart + len, ystart + (2 * len), len);
		solve(xstart, xstart + len, ystart + (2 * len), yend, len);
		solve(xstart + len, xstart + (2 * len), ystart + (2 * len), yend, len);
		solve(xstart + (2 * len), xend, ystart + (2 * len), yend, len);
	}
}

int main()
{
	vector <int> tmp;
	int x;

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

	cout << yin << endl << zero << endl <<  yang << endl;

	return 0;
}

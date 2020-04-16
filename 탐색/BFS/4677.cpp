#include <iostream>
#include <vector>

using namespace std;

vector <vector <int>> fld;
int n, m;

void erase(int i, int j)
{
	if (i <= 0 || n < i || j <= 0 || m < j)
		return;

	fld[i][j] = 0;

	if(fld[i - 1][j - 1] == 1)
		erase(i - 1, j - 1);

	if (fld[i - 1][j] == 1)
		erase(i - 1, j);

	if (fld[i - 1][j + 1] == 1)
		erase(i - 1, j + 1);

	if (fld[i][j - 1] == 1)
		erase(i, j - 1);

	if (fld[i][j + 1] == 1)
		erase(i, j + 1);

	if (fld[i + 1][j - 1] == 1)
		erase(i + 1, j - 1);

	if (fld[i + 1][j] == 1)
		erase(i + 1, j);

	if (fld[i + 1][j + 1] == 1)
		erase(i + 1, j + 1);
}

int cnt()
{
	int ret = 0;

	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= m; j++)
		{
			if (fld[i][j] == 1)
			{
				erase(i, j);
				ret++;
			}
		}
	}

	return ret;
}

int main()
{
	vector <int> tmp;
	char x;

	cin >> n >> m;

	while (n != 0 || m != 0)
	{
		fld.clear();

		tmp.clear();

		for (int i = 0; i <= m + 1; i++)
			tmp.push_back(-1);

		fld.push_back(tmp);

		for (int i = 0; i < n; i++)
		{
			tmp.clear();

			tmp.push_back(-1);

			for (int j = 0; j < m; j++)
			{
				cin >> x;

				if (x == '@')
					tmp.push_back(1);
				else
					tmp.push_back(0);
			}

			tmp.push_back(-1);

			fld.push_back(tmp);
		}

		tmp.clear();

		for (int i = 0; i <= m + 1; i++)
			tmp.push_back(-1);

		fld.push_back(tmp);

		cout << cnt() << "\n";

		cin >> n >> m;
	}

	return 0;
}

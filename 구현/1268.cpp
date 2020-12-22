#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> fld;
	vector <vector <int>> grph;
	vector <int> tmp;
	int n, x, max, idx, cnt;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < 5; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		fld.push_back(tmp);
	}

	tmp.clear();

	for (int i = 0; i < n; i++)
	{
		tmp.push_back(0);
	}

	for (int i = 0; i < n; i++)
	{
		grph.push_back(tmp);
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < n; j++)
		{
			for (int k = j + 1; k < n; k++)
			{
				if (fld[j][i] == fld[k][i])
				{
					grph[j][k] = 1;
					grph[k][j] = 1;
				}
			}
		}
	}

	max = 0;

	for (int i = n - 1; 0 <= i; i--)
	{
		cnt = 0;

		for (int j = 0; j < n; j++)
		{
			cnt += grph[i][j];
		}

		if (max <= cnt)
		{
			max = cnt;
			idx = i;
		}
	}

	cout << idx + 1 << endl;

	return 0;
}

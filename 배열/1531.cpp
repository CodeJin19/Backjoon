#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> fld;
	vector <int> tmp;
	int n, m, x1, x2, y1, y2, cnt = 0;

	cin >> n >> m;

	for (int i = 0; i < 101; i++)
	{
		tmp.push_back(0);
	}

	for (int i = 0; i < 101; i++)
	{
		fld.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		cin >> x1 >> y1 >> x2 >> y2;

		for (int j = y1; j <= y2; j++)
		{
			for (int k = x1; k <= x2; k++)
			{
				fld[j][k]++;
			}
		}
	}

	for (int i = 1; i < 101; i++)
	{
		for (int j = 1; j < 101; j++)
		{
			if (m < fld[i][j])
			{
				cnt++;
			}
		}
	}

	cout << cnt << endl;

	return 0;
}

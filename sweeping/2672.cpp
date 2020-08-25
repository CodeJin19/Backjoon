#include <iostream>
#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n;
	double x1, x2, y1, y2, ans, chk;
	vector <vector <double>> list;
	vector <double> x;
	vector <double> y;
	vector <double> tmp;

	cin >> n;

	for (int i = 0; i < n; ++i)
	{
		cin >> x1 >> y1 >> x2 >> y2;

		tmp.clear();
		tmp.push_back(x1);
		tmp.push_back(y1);
		tmp.push_back(x2);
		tmp.push_back(y2);

		list.push_back(tmp);
		
		x2 += x1;
		y2 += y1;

		x.push_back(x1);
		x.push_back(x2);
		y.push_back(y1);
		y.push_back(y2);
	}

	sort(x.begin(), x.end());
	sort(y.begin(), y.end());

	ans = 0;

	for (int i = 0; i < 2 * n - 1; ++i)
	{
		for (int j = 0; j < 2 * n - 1; ++j)
		{
			for (int k = 0; k < n; ++k)
			{
				if (list[k][0] <= x[i] && x[i + 1] <= list[k][0] + list[k][2] && list[k][1] <= y[j] && y[j + 1] <= list[k][1] + list[k][3])
				{
					ans += (x[i + 1] - x[i]) * (y[j + 1] - y[j]);
					break;
				}
			}
		}
	}

	chk = (int)ans;

	if (chk == ans)
	{
		cout << chk << endl;
	}
	else
	{
		printf("%.2f\n", ans);
	}

	return 0;
}

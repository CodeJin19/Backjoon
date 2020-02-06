#include <iostream>
#include <vector>
#include <math.h>

using namespace std;

int main()
{
	int k, x, now, dist, len;
	vector <vector <int>> fld;
	vector <int> list;
	vector <int> tmp;

	cin >> k;

	for (int i = 0; i < pow(2, k) - 1; i++)
	{
		cin >> x;
		list.push_back(x);
	}

	len = pow(2, k) - 1;
	now = pow(2, k) - 1;
	now /= 2;
	dist = pow(2, k);
	
	for (int i = 0; i < k; i++)
	{
		tmp.clear();

		for (int j = now; j < len;)
		{
			tmp.push_back(list[j]);
			j += dist;
		}

		fld.push_back(tmp);

		now /= 2;
		dist /= 2;
	}

	for (int i = 0; i < fld.size(); i++)
	{
		for (int j = 0; j < fld[i].size(); j++)
		{
			cout << fld[i][j] << " ";
		}
		cout << "\n";
	}

	return 0;
}

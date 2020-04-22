#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> table;
	vector <int> tmp;
	int t, n, m, l = 2;

	cin >> t;

	tmp.push_back(1);
	table.push_back(tmp);
	tmp.clear();
	tmp.push_back(1);
	tmp.push_back(1);
	table.push_back(tmp);

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n >> m;

		if(l <= m)
		{
			for (; l <= m; l++)
			{
				tmp.clear();
				tmp.push_back(1);

				for (int i = 1; i < l; i++)
				{
					tmp.push_back(table[l - 1][i - 1] + table[l - 1][i]);
				}

				tmp.push_back(1);

				table.push_back(tmp);
			}
		}

		cout << table[m][n] << "\n";
	}

	return 0;
}

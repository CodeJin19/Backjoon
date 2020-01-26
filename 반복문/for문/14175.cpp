#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <char>> fld;
	vector <char> tmp;
	int m, n, k;
	char x;

	cin >> m >> n >> k;

	for (int i = 0; i < m; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		fld.push_back(tmp);
	}

	for (int i = 0; i < m; i++)
	{
		for (int a = 0; a < k; a++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int b = 0; b < k; b++)
				{
					cout << fld[i][j];
				}
			}

			cout << endl;
		}
	}

	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int t, n, m, x, sum, cnt;
	bool flag;
	vector <vector <int>> fld;
	vector <int> tmp;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		fld.clear();
		sum = 0;

		cin >> n >> m;

		for (int i = 0; i < n; i++)
		{
			tmp.clear();

			for (int j = 0; j < m; j++)
			{
				cin >> x;
				tmp.push_back(x);
			}

			fld.push_back(tmp);
		}

		for (int j = 0; j < m; j++)
		{
			for (int i = n - 1; 0 <= i; i--)
			{
				if (fld[i][j] == 1 && i != n - 1)
				{
					flag = false;

					for (x = i + 1; x <= n - 1; x++)
					{
						if (fld[x][j] == 1)
						{
							flag = true;
							break;
						}
					}

					if (flag)
					{
						fld[i][j] = 0;
						fld[x - 1][j] = 1;
						sum += (x - 1 - i);
					}
					else
					{
						fld[i][j] = 0;
						fld[n - 1][j] = 1;
						sum += (n - 1 - i);
					}
				}
			}
		}
        
			cout << sum << endl;
	}
    
	return 0;
}

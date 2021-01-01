#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> fld;
	vector <int> tmp;
	string s;
	int n, x;

	cin >> n;

	for (int i = 0; i <= n + 1; i++)
	{
		tmp.push_back(0);
	}

	for (int i = 0; i <= n + 1; i++)
	{
		fld.push_back(tmp);
	}

	for (int i = 1; i <= n; i++)
	{
		cin >> s;

		for (int j = 1; j <= n; j++)
		{
			if (s[j - 1] != '.')
			{
				x = (int)(s[j - 1] - '0');

				fld[i][j] = -1;
				
				if (fld[i - 1][j - 1] != -1)
				{
					fld[i - 1][j - 1] += x;
				}

				if (fld[i - 1][j] != -1)
				{
					fld[i - 1][j] += x;
				}
				
				if (fld[i - 1][j + 1] != -1)
				{
					fld[i - 1][j + 1] += x;
				}
				
				if (fld[i][j - 1] != -1)
				{
					fld[i][j - 1] += x;
				}
				
				if (fld[i][j + 1] != -1)
				{
					fld[i][j + 1] += x;
				}
				
				if (fld[i + 1][j - 1] != -1)
				{
					fld[i + 1][j - 1] += x;
				}
				
				if (fld[i + 1][j] != -1)
				{
					fld[i + 1][j] += x;
				}
				
				if (fld[i + 1][j + 1] != -1)
				{
					fld[i + 1][j + 1] += x;
				}
			}
		}
	}

	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			if (fld[i][j] == -1)
			{
				cout << "*";
			}
			else if (10 <= fld[i][j])
			{
				cout << "M";
			}
			else
			{
				cout << fld[i][j];
			}
		}
		cout << "\n";
	}

	return 0;
}

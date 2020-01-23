#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector <vector <char>> fld;
	vector <char> tmp;
	string s;
	int n;

	cin >> n;

	while (n != 0)
	{
		fld.clear();

		cin >> s;

		for (int i = 0; i < s.length() / n; i++)
		{
			tmp.clear();

			if (i % 2 == 0)
			{
				for (int j = 0; j < n; j++)
				{
					tmp.push_back(s[n * i + j]);
				}
			}
			else
			{
				for (int j = 1; j <= n; j++)
				{
					tmp.push_back(s[n * (i + 1) - j]);
				}
			}

			fld.push_back(tmp);
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < fld.size(); j++)
			{
				cout << fld[j][i];
			}
		}
		cout << "\n";

		cin >> n;
	}

	return 0;
}

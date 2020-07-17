#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector <vector <char>> fld;

int getMin(int x, int y)
{
	if (x < y)
		return x;
	else
		return y;
}

int solve(int y, int x)
{
	char bcmp = 'B', wcmp = 'W';
	int bcnt = 0, wcnt = 0;

	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			if (fld[y + i][x + j] != bcmp)
				bcnt++;

			if (fld[y + i][x + j] != wcmp)
				wcnt++;
			
			if (bcmp == 'B')
				bcmp = 'W';
			else
				bcmp = 'B';

			if (wcmp == 'B')
				wcmp = 'W';
			else
				wcmp = 'B';
		}

		if (bcmp == 'B')
			bcmp = 'W';
		else
			bcmp = 'B';

		if (wcmp == 'B')
			wcmp = 'W';
		else
			wcmp = 'B';
	}

	return getMin(wcnt, bcnt);
}

int main()
{
	string s;
	int n, m, min = 2112345678;
	vector <char> tmp;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();
		cin >> s;

		for (int j = 0; j < m; j++)
		{
			tmp.push_back(s[j]);
		}

		fld.push_back(tmp);
	}

	for (int i = 0; i < n - 7; i++)
		for (int j = 0; j < m - 7; j++)
			min = getMin(min, solve(i, j));

	cout << min << endl;

	return 0;
}

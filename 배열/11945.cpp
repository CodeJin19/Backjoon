#include <iostream>

using namespace std;

int main()
{
	int n, m;
	char fld[11][11];

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			cin >> fld[i][j];
		}
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = m - 1; 0 <= j; j--)
		{
			cout << fld[i][j];
		}
		cout << endl;
	}

	return 0;
}

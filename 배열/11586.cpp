#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, turn;
	char x;
	
	vector <vector <char>> fld;
	vector <char> tmp;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		fld.push_back(tmp);
	}

	cin >> turn;

	switch (turn)
	{
	case 1:
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				cout << fld[i][j];
			}
			cout << "\n";
		}
		break;
	case 2:
		for (int i = 0; i < n; i++)
		{
			for (int j = n - 1; 0 <= j; j--)
			{
				cout << fld[i][j];
			}
			cout << "\n";
		}
		break;
	case 3:
		for (int i = n - 1; 0 <= i; i--)
		{
			for (int j = 0; j < n; j++)
			{
				cout << fld[i][j];
			}
			cout << "\n";
		}
		break;
	}

	return 0;
}

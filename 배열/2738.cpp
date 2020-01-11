#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> a;
	vector <vector <int>> b;
	vector <int> tmp;

	int n, m, x;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < m; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		a.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < m; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		b.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			cout << a[i][j] + b[i][j] << " ";
		}
		cout << "\n";
	}
	return 0;
}

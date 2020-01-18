#include <iostream>
#include <vector>
using namespace std;

int main()
{
	vector <vector <int> > a, b, c;
	vector <int> tmp;
	int n, x, cnt = 0;

	cin >> n;
	
	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			cin >> x;

			tmp.push_back(x);
		}

		a.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			cin >> x;

			tmp.push_back(x);
		}

		b.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			tmp.push_back(0);
		}

		c.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			for (int k = 0; k < n; k++)
			{
				c[i][j] += a[i][k] * b[k][j];
			}
		}
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			if (1 <= c[i][j])
			{
				cnt++;
			}
		}
	}

	cout << cnt << endl;

	return 0;
}

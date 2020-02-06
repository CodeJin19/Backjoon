#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, m, x, sum = 0;
	vector <int> target;
	vector <bool> fld;

	cin >> n >> m;

	for (int i = 0; i <= n; i++)
	{
		fld.push_back(true);
	}

	for (int i = 0; i < m; i++)
	{
		cin >> x;
		target.push_back(x);
	}

	for (int j = 0; j < m; j++)
	{
		for (int i = target[j]; i <= n; )
		{
			if (fld[i])
			{
				sum += i;
				fld[i] = false;
			}

			i += target[j];
		}
	}

	cout << sum << endl;

	return 0;
}

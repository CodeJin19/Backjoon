#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> A;
	vector <vector <int>> B;
	vector <vector <int>> ans;
	vector <int> tmp;

	int n, m, k, x;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < m; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		A.push_back(tmp);
	}

	cin >> m >> k;

	for (int i = 0; i < m; i++)
	{
		tmp.clear();

		for (int j = 0; j < k; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		B.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < k; j++)
		{
			tmp.push_back(0);
		}

		ans.push_back(tmp);
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < k; j++)
		{
			for (int l = 0; l < m; l++)
			{
				ans[i][j] += (A[i][l] * B[l][j]);
			}
		}
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < k; j++)
		{
			cout << ans[i][j] << " ";
		}
		cout << endl;
	}

	return 0;
}

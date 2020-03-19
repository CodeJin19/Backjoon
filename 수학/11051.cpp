#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> pascal;
	vector <int> tmp;
	int n, k, idx = 1, x;

	cin >> n >> k;

	tmp.push_back(1);
	tmp.push_back(1);

	pascal.push_back(tmp);

	while (idx < n)
	{
		tmp.clear();
		tmp.push_back(1);

		if (idx <= k)
		{
			for (int i = 1; i <= idx; i++)
			{
				x = pascal[idx - 1][i - 1] + pascal[idx - 1][i];

				if (10007 < x)
					x %= 10007;

				tmp.push_back(x);
			}
		}
		else
		{
			for (int i = 1; i <= k; i++)
			{
				x = pascal[idx - 1][i - 1] + pascal[idx - 1][i];

				if (10007 < x)
					x %= 10007;

				tmp.push_back(x);
			}
		}

		tmp.push_back(1);
		pascal.push_back(tmp);

		idx++;
	}
	
	cout << pascal[n - 1][k] << endl;

	return 0;
}

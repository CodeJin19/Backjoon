#include <iostream>
#include <vector>

using namespace std;

int min(int x, int y)
{
	if (x < y)
		return x;
	else
		return y;
}

int main()
{
	vector <int> dp;
	vector <int> tetra;
	int n, add1, add2, idx1, idx2, val, z;

	cin >> n;

	for (int i = 0; i <= n; i++)
		dp.push_back(0);

	tetra.push_back(0);
	add1 = 0;
	add2 = 0;

	for (int x = 0; x <= n;)
	{
		add1++;
		add2 += add1;
		x += add2;
		tetra.push_back(x);
	}

	idx1 = 1;
	idx2 = 1;
	val = 1;

	while (idx1 <= n)
	{
		if (idx1 == tetra[idx2])
		{
			val = 1;
			dp[idx1++] = val++;
			idx2++;
		}
		else
		{
			dp[idx1] = val;

			for (int i = idx2 - 1; 0 < i; i--)
			{
				dp[idx1] = min(dp[idx1], dp[idx1 - tetra[i]] + 1);
			}

			val = dp[idx1] + 1;
			idx1++;
		}
	}

	cout << dp[n] << endl;

	return 0;
}

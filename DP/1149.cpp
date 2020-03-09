#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> cache;
	vector <vector <int>> data;
	vector <int> tmp(3);
	int n, ans = 2112345678;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < 3; j++)
			cin >> tmp[j];

		data.push_back(tmp);
	}

	for (int i = 0; i < 3; i++)
		tmp[i] = data[0][i];

	cache.push_back(tmp);

	for (int i = 1; i < n; i++)
	{
		if (cache[i - 1][1] < cache[i - 1][2])
			tmp[0] = cache[i - 1][1] + data[i][0];
		else
			tmp[0] = cache[i - 1][2] + data[i][0];

		if (cache[i - 1][0] < cache[i - 1][2])
			tmp[1] = cache[i - 1][0] + data[i][1];
		else
			tmp[1] = cache[i - 1][2] + data[i][1];

		if (cache[i - 1][0] < cache[i - 1][1])
			tmp[2] = cache[i - 1][0] + data[i][2];
		else
			tmp[2] = cache[i - 1][1] + data[i][2];

		cache.push_back(tmp);
	}

	for (int i = 0; i < 3; i++)
	{
		if (cache[n - 1][i] < ans)
			ans = cache[n - 1][i];
	}

	cout << ans << endl;
	
	return 0;
}

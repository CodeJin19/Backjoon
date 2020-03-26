#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <int>> total;
	vector <int> tmp(2, 0);
	int n, k, s, y, sum = 0;

	for (int i = 0; i < 6; i++)
		total.push_back(tmp);

	cin >> n >> k;

	for (int i = 0; i < n; i++)
	{
		cin >> s >> y;

		y--;

		total[y][s] += 1;
	}

	for (int i = 0; i < 6; i++)
	{
		for (int j = 0; j < 2; j++)
		{
			sum += (total[i][j] / k);

			if (total[i][j] % k != 0)
				sum++;
		}
	}

	cout << sum << endl;

	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

int getMax(int x, int y)
{
	if (x < y)
	{
		return y;
	}
	else
	{
		return x;
	}
}

int main()
{
	int t, x, n;
	vector <vector <int>> sticker;
	vector <vector <int>> max;
	vector <int> tmp;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		sticker.clear();
		max.clear();

		for (int i = 0; i < 2; i++)
		{
			tmp.clear();

			for (int j = 0; j < n; j++)
			{
				cin >> x;
				tmp.push_back(x);
			}

			sticker.push_back(tmp);
		}

		tmp.clear();

		for (int i = 0; i < n; i++)
			tmp.push_back(0);

		for (int i = 0; i < 3; i++)
			max.push_back(tmp);
		
		max[0][n - 1] = 0;
		max[1][n - 1] = sticker[0][n - 1];
		max[2][n - 1] = sticker[1][n - 1];

		for (int i = n - 2; 0 <= i; i--)
		{
			max[0][i] = getMax(max[1][i + 1], max[2][i + 1]);
			max[1][i] = sticker[0][i] + getMax(max[0][i + 1], max[2][i + 1]);
			max[2][i] = sticker[1][i] + getMax(max[0][i + 1], max[1][i + 1]);
		}

		cout << getMax(getMax(max[0][0], max[1][0]), max[2][0]) << "\n";
	}

	return 0;
}

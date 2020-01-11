#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> basket;
	vector <int> tmp;
	int n, m, x, y;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		basket.push_back(i);
	}

	for (int i = 0; i < m; i++)
	{
		cin >> x >> y;
		x--;
		y--;

		tmp.clear();

		for (int j = y; x <= j; j--)
		{
			tmp.push_back(basket[j]);
		}

		for (int j = x; j <= y; j++)
		{
			basket[j] = tmp[j - x];
		}
	}

	for (int i = 0; i < n; i++)
	{
		cout << basket[i] + 1 << " ";
	}
	cout << endl;

	return 0;
}

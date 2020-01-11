#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> basket;

	int n, m, st, ed, x;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		basket.push_back(0);
	}

	for (int i = 0; i < m; i++)
	{
		cin >> st >> ed >> x;

		for (int j = st - 1; j < ed; j++)
		{
			basket[j] = x;
		}
	}

	for (int i = 0; i < n; i++)
	{
		cout << basket[i] << " ";
	}

	cout << endl;

	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, m, tmp, x, y;
	vector <int> basket;

	cin >> n >> m;

	for (int i = 0; i <= n; i++)
	{
		basket.push_back(i);
	}

	for (int i = 0; i < m; i++)
	{
		cin >> x >> y;

		tmp = basket[x];
		basket[x] = basket[y];
		basket[y] = tmp;
	}

	for (int i = 1; i <= n; i++)
	{
		cout << basket[i] << " ";
	}
	cout << endl;

	return 0;
}

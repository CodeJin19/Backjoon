#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, m, from, till, mid, x;
	vector <int> basket;
	vector <int> tmp;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		basket.push_back(i + 1);
	}

	for (int i = 0; i < m; i++)
	{
		cin >> from >> till >> mid;

		tmp.clear();

		for (int j = from - 1; j < till; j++)
		{
			tmp.push_back(basket[j]);
		}

		for (int j = 0; j <= till - mid; j++)
		{
			basket[from - 1 + j] = tmp[mid - from + j];
		}

		for (int j = 0; j < mid - from; j++ )
		{
			basket[from + till - mid + j] = tmp[j];
		}
	}

	for (int i = 0; i < n; i++)
	{
		cout << basket[i] << " ";
	}
	cout << endl;

	return 0;
}

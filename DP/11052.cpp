#include <iostream>
#include <vector>

using namespace std;

vector <int> price;
vector <int> cache;
int n;

int max(int x, int y)
{
	if (x <= y)
		return y;
	else
		return x;
}

int main()
{
	int x;

	cin >> n;

	price.push_back(0);

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		price.push_back(x);
	}

	for (int i = 0; i <= n; i++)
		cache.push_back(0);

	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			cache[i] = max(cache[i], cache[i - j] + price[j]);
		}
	}

	cout << cache[n] << endl;

	return 0;
}

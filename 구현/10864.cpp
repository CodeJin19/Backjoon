#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, m, x, y;
	vector <int> friends;

	cin >> n >> m;

	for (int i = 0; i <= n; i++)
	{
		friends.push_back(0);
	}

	for (int i = 0; i < m; i++)
	{
		cin >> x >> y;

		friends[x] += 1;
		friends[y] += 1;
	}

	for (int i = 1; i <= n; i++)
	{
		cout << friends[i] << endl;
	}

	return 0;
}

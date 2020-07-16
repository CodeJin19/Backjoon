#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n, x, y;
	vector <pair <int, int>> data;
	pair <int, int> z;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;

		z = make_pair(x, y);

		data.push_back(z);
	}

	sort(data.begin(), data.end());

	for (int i = 0; i < data.size(); i++)
	{
		cout << data[i].first << " " << data[i].second << "\n";
	}

	return 0;
}

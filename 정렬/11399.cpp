#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n, x;
	int sum = 0;
	vector <int> data;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		data.push_back(x);
	}

	sort(data.begin(), data.end());

	for (int i = 0; i < n; i++)
	{
		sum += (data[i] * (n - i));
	}

	cout << sum << endl;

	return 0;
}

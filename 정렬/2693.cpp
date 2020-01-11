#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int t, x;
	vector <int> arr;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		arr.clear();

		for (int i = 0; i < 10; i++)
		{
			cin >> x;
			arr.push_back(x);
		}

		sort(arr.begin(), arr.end());

		cout << arr[7] << "\n";
	}

	return 0;
}

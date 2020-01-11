#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n, x;
	vector <int> arr;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		arr.push_back(x);
	}

	sort(arr.begin(), arr.end());

	for (int i = 0; i < n; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;

	return 0;
}

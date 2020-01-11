#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> arr;

	int n;

	for (int i = 0; i < 4; i++)
	{
		cin >> n;
		arr.push_back(n);
	}

	sort(arr.begin(), arr.end());

	cout << arr[0] * arr[2] << endl;

	return 0;
}

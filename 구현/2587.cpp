#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> arr;
	int n, sum = 0;

	for (int i = 0; i < 5; i++)
	{
		cin >> n;

		arr.push_back(n);
		sum += n;
	}

	sort(arr.begin(), arr.end());

	cout << sum / 5 << endl << arr[2] << endl;

	return 0;
}

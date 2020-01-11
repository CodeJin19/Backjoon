#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int n, l, x, idx = 0;
	vector <int> arr;

	cin >> n >> l;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr.push_back(x);
	}

	sort(arr.begin(), arr.end());

	while (idx < n && arr[idx] <= l)
	{
		l++;
		idx++;
	}

	cout << l << endl;

	return 0;
}

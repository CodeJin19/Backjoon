#include <iostream>

using namespace std;

int main()
{
	int arr[101];
	int n, x, cnt = 0;

	for (int i = 1; i <= 100; i++)
		arr[i] = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr[x] += 1;
	}

	for (int i = 1; i <= 100; i++)
		if (arr[i] != 0)
			cnt += (arr[i] - 1);

	cout << cnt << endl;

	return 0;
}

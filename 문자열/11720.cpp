#include <iostream>

using namespace std;

int main()
{
	int n, x;
	int sum = 0;
	char arr[110];

	cin >> n;

	cin >> arr;

	for (int i = 0; i < n; i++)
	{
		x = arr[i] - '0';
		sum += x;
	}

	cout << sum << "\n";

	return 0;
}

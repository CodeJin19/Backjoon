#include <iostream>

using namespace std;

int main()
{
	int n, x, y;
	char arr[5];

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> arr;

		x = arr[0] - '0';
		y = arr[2] - '0';

		cout << x + y << "\n";
	}

	return 0;
}

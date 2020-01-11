#include <iostream>

using namespace std;

int main()
{
	int a, b, c, num, x;
	int arr[10];

	cin >> a >> b >> c;

	num = a * b * c;

	for (int i = 0; i < 10; i++)
	{
		arr[i] = 0;
	}

	while (num != 0)
	{
		x = num % 10;
		arr[x] ++;
		num /= 10;
	}

	for (int i = 0; i < 10; i++)
	{
		cout << arr[i] << "\n";
	}

	return 0;
}

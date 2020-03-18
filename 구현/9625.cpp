#include <iostream>

using namespace std;

int main()
{
	int a = 1, b = 0, x, y, n;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		y = a + b;
		x = b;

		a = x;
		b = y;
	}

	cout << a << " " << b << endl;

	return 0;
}

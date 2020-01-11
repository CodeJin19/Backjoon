#include <iostream>

using namespace std;

int main()
{
	int x, y;
	int sum = 0;

	for (int i = 0; i < 4; i++)
	{
		cin >> x;
		sum += x;
	}

	x = sum / 60;
	y = sum - x * 60;

	cout << x << endl << y << endl;

	return 0;
}

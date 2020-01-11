#include <iostream>

using namespace std;

int main()
{
	int sum = 0;
	int x;

	for (int i = 0; i < 5; i++)
	{
		cin >> x;

		if (x < 40)
		{
			x = 40;
		}

		sum += x;
	}

	cout << sum / 5 << endl;

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int t, sum = 0, x;

	cin >> t;

	for (int i = 0; i < 5; i++)
	{
		cin >> x;

		if (x == t)
		{
			sum++;
		}
	}

	cout << sum << endl;

	return 0;
}

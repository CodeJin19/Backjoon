#include <iostream>

using namespace std;

int main()
{
	int t, d, max;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> d;
		max = 0;

		while (max + max * max <= d)
		{
			max++;
		}

		cout << max - 1 << endl;
	}

	return 0;
}

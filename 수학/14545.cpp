#include <iostream>

using namespace std;

int main()
{
	int t, l, sum;

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		sum = 0;

		cin >> l;

		for (int i = 1; i <= l; i++)
		{
			sum += (i * i);
		}

		cout << sum << "\n";
	}

	return 0;
}

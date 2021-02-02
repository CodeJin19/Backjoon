#include <iostream>

using namespace std;

int main()
{
	int subTotal[11];
	int x, diff, min = 2112345678, idx;

	subTotal[0] = 0;

	for (int i = 1; i <= 10; i++)
	{
		cin >> x;
		subTotal[i] = subTotal[i - 1] + x;
		
		diff = subTotal[i] - 100;

		if (diff < 0)
			diff = 0 - diff;

		if (diff <= min)
		{
			idx = i;
			min = diff;
		}
	}

	cout << subTotal[idx] << endl;

	return 0;
}

#include <iostream>

using namespace std;

int getSum(int n)
{
	int sum = 0;

	while (n != 0)
	{
		sum += n % 10;
		n /= 10;
	}

	return sum;
}

int main()
{
	int l, d, x, min, max;

	cin >> l >> d >> x;

	for (int i = l; i <= d; i++)
	{
		if (getSum(i) == x)
		{
			min = i;
			break;
		}
	}
	
	for (int i = d; l <= i; i--)
	{
		if (getSum(i) == x)
		{
			max = i;
			break;
		}
	}

	cout << min << "\n" << max << "\n";

	return 0;
}

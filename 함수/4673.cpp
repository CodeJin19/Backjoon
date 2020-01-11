#include <iostream>

using namespace std;

int cache[10010];

int d(int n)
{
	int sum = n;

	while (n != 0)
	{
		sum += (n % 10);
		n /= 10;
	}

	return sum;
}

int main()
{
	for (int i = 1; i <= 10000; i++)
	{
		cache[i] = 1;
	}

	for (int i = 1; i <= 10000; i++)
	{
		cache[d(i)] = 0;
	}

	for (int i = 1; i <= 10000; i++)
	{
		if (cache[i] == 1)
		{
			cout << i << "\n";
		}
	}
	
	return 0;
}

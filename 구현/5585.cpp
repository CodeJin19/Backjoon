#include <iostream>

using namespace std;

int main()
{
	int n, cnt;
	int sum = 0;

	cin >> n;

	n = 1000 - n;

	if (500 <= n)
	{
		cnt = n / 500;
		sum += cnt;
		n -= (cnt * 500);
	}

	if (100 <= n)
	{
		cnt = n / 100;
		sum += cnt;
		n -= (cnt * 100);
	}

	if (50 <= n)
	{
		cnt = n / 50;
		sum += cnt;
		n -= (cnt * 50);
	}

	if (10 <= n)
	{
		cnt = n / 10;
		sum += cnt;
		n -= (cnt * 10);
	}

	if (5 <= n)
	{
		cnt = n / 5;
		sum += cnt;
		n -= (cnt * 5);
	}

	if (1 <= n)
	{
		cnt = n / 1;
		sum += cnt;
		n -= (cnt * 1);
	}

	cout << sum << endl;

	return 0;
}

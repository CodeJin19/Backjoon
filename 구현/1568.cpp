#include <iostream>

using namespace std;

int main()
{
	int n, sum, x = 1, cnt = 0;

	cin >> n;

	sum = 0;

	while (sum != n)
	{
		sum += x;
		x++;
		cnt++;

		if (n < sum + x)
		{
			x = 1;
		}
	}

	cout << cnt << endl;

	return 0;
}

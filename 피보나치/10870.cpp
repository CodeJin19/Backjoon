#include <iostream>

using namespace std;

int main()
{
	int n, a, b, c, cnt;

	cin >> n;

	if (n <= 1)
	{
		cout << n << endl;
	}
	else
	{
		a = 0;
		b = 1;
		cnt = 1;

		while (cnt < n)
		{
			c = a + b;
			a = b;
			b = c;
			cnt++;
		}

		cout << c << endl;
	}

	return 0;
}

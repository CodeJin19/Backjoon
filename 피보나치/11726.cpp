#include <iostream>

using namespace std;

int main()
{
	int n, a, b, c, cnt;

	cin >> n;

	if (n <= 2)
	{
		cout << n << endl;
	}
	else
	{
		a = 1;
		b = 2;
		c = a + b;
		cnt = 3;

		while (cnt < n)
		{
			a = b;
			b = c;
			c = a + b;
        		c %= 10007;
			cnt++;
		}

		cout << c << endl;
	}

	return 0;
}

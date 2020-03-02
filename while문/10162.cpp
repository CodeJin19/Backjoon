#include <iostream>

using namespace std;

int main()
{
	int a = 0, b = 0, c = 0, n;

	cin >> n;

	while (300 <= n)
	{
		a++;
		n -= 300;
	}

	while (60 <= n)
	{
		b++;
		n -= 60;
	}

	while (10 <= n)
	{
		c++;
		n -= 10;
	}

	if (n == 0)
		cout << a << " " << b << " " << c << endl;
	else
		cout << "-1\n";

	return 0;
}

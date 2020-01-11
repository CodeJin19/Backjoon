#include <iostream>

using namespace std;

int main()
{
	int a, b, c, d, p;

	cin >> a >> b >> c >> d >> p;

	a *= p;

	if (c < p)
	{
		b += (p - c) * d;
	}

	if (a < b)
	{
		cout << a << endl;
	}
	else
	{
		cout << b << endl;
	}

	return 0;
}

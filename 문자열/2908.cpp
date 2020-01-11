#include <iostream>

using namespace std;

int rev(int x)
{
	int a, b;

	a = x % 10;
	x /= 10;
	b = x % 10;
	x /= 10;
	a *= 100;
	a += (b * 10 + x);

	return a;
}

int main()
{
	int a, b;

	cin >> a >> b;

	a = rev(a);
	b = rev(b);

	if (a < b)
	{
		cout << b << endl;
	}
	else
	{
		cout << a << endl;
	}

	return 0;
}

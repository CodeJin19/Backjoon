#include <iostream>
#include <string>

using namespace std;

int gcd(int x, int y)
{
	int d, r;

	r = y % x;

	while (r != 0)
	{
		y = x;
		x = r;
		r = y % x;
	}

	return x;
}

int main()
{
	string s;
	int a = 0, b = 0, x, d;

	cin >> s;

	for (int i = 0; i < s.find(":"); i++)
	{
		a *= 10;
		x = s[i] - '0';
		a += x;
	}

	for (int i = s.find(":") + 1; i < s.length(); i++)
	{
		b *= 10;
		x = s[i] - '0';
		b += x;
	}

	if (a < b)
	{
		d = gcd(a, b);
	}
	else
	{
		d = gcd(b, a);
	}

	cout << a / d << ":" << b / d << endl;

	return 0;
}

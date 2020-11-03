#include <iostream>
#include <string>

using namespace std;

int change(int x)
{
	int ret = 0;
	int unit = 1;
	int d;

	while (x != 0)
	{
		d = x % 10;
		x /= 10;

		if (d == 8)
		{
			d = -1;
		}

		ret += (d * unit);
		unit *= 8;
	}

	return ret;
}

int swap(string s)
{
	int idx = 0;
	int ret = 0;

	while (s[idx] != '\0')
	{
		ret *= 10;

		switch (s[idx])
		{
		case '-':
			ret += 0;
			break;
		case '\\':
			ret += 1;
			break;
		case '(':
			ret += 2;
			break;
		case '@':
			ret += 3;
			break;
		case '?':
			ret += 4;
			break;
		case '>':
			ret += 5;
			break;
		case '&':
			ret += 6;
			break;
		case '%':
			ret += 7;
			break;
		case '/':
			ret += 8;
			break;
		}

		idx++;
	}

	return ret;
}

int main()
{
	int x;
	string s;

	cin >> s;

	while (s[0] != '#')
	{
		x = swap(s);
		cout << change(x) << endl;
		cin >> s;
	}

	return 0;
}

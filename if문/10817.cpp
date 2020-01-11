#include <iostream>

using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	if (a < b)
	{
		if (b < c)
		{
			cout << b << "\n";
		}
		else if(a < c)
		{
			cout << c << "\n";
		}
		else
		{
			cout << a << "\n";
		}
	}
	else
	{
		if (a < c)
		{
			cout << a << "\n";
		}
		else if (b < c)
		{
			cout << c << "\n";
		}
		else
		{
			cout << b << "\n";
		}
	}

	return 0;
}

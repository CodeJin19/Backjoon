#include <iostream>

using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	a = b - a;
	b = c - b;

	if (a < b)
	{
		cout << b - 1 << endl;
	}
	else
	{
		cout << a - 1 << endl;
	}

	return 0;
}

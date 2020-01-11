#include <iostream>

using namespace std;

int main()
{
	int year, r1, r2, r3;

	cin >> year;

	r1 = year % 4;
	r2 = year % 100;
	r3 = year % 400;

	if (r3 == 0)
	{
		cout << "1\n";
	}
	else if (r2 == 0)
	{
		cout << "0\n";
	}
	else if (r1 == 0)
	{
		cout << "1\n";
	}
	else
	{
		cout << "0\n";
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int a, b, c, sum, t;

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		sum = 0;

		cin >> a >> b >> c;

		sum += (a + b + c);

		if (180 == sum)
			cout << a << " " << b << " " << c << " Seems OK\n";
		else
			cout << a << " " << b << " " << c << " Check\n";
	}

	return 0;
}

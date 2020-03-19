#include <iostream>

using namespace std;

int main()
{
	int x, r = 0;

	cin >> x;

	while (x != 1 && r == 0)
	{
		r = x % 2;
		x /= 2;
	}

	if (r == 0)
		cout << "1\n";
	else
		cout << "0\n";

	return 0;
}

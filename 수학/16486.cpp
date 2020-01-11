#include <iostream>

using namespace std;

int main()
{
	double length;
	int x, r;

	cin >> x >> r;

	length = r * 2;
	length *= 3.14159265359;
	length += (2 * x);

	cout << fixed;
	cout.precision(6);

	cout << length << endl;

	return 0;
}

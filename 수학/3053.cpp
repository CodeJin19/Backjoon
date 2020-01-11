#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int r;
	double len;

	cin >> r;

	len = r * r;
	len *= 3.14159265358979323846;

	cout << fixed;
	cout.precision(8);
	cout << len << endl;

	len = 2 * r;
	len *= r;

	cout << len << endl;

	return 0;
}

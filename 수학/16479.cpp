#include <iostream>

using namespace std;

int main()
{
	double d, k, d1, d2;

	cin >> k >> d1 >> d2;

	k *= k;
	d = d1 - d2;
	d /= 2;
	d *= d;

	cout << k - d << endl;

	return 0;
}

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int a, b;
	double m;

	cin >> a >> b;

	m = b - a;
	m /= 400;
	m = pow(10, m);
	m += 1;
	m = 1 / m;

	cout << m << endl;
	
	return 0;
}

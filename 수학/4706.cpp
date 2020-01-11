#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int main()
{
	double ta, tb, r;

	cin >> ta >> tb;

	while (ta != 0 || tb != 0)
	{
		r = tb / ta;
		r *= r;
		r = 1 - r;
		r = sqrt(r);

		printf("%.3f\n", r);

		cin >> ta >> tb;
	}

	return 0;
}

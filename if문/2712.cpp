#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
	int n;
	double x, y;
	char scale[5];

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> scale;

		if (scale[0] == 'k')
		{
			y = x * 2.2046;
			printf("%.4f lb\n", y);
		}
		else if (scale[0] == 'g')
		{
			y = x * 3.7854;
			printf("%.4f l\n", y);
		}
		else if (scale[1] == 'b')
		{
			y = x * 0.4536;
			printf("%.4f kg\n", y);
		}
		else
		{
			y = x * 0.2642;
			printf("%.4f g\n", y);
		}
	}

	return 0;
}

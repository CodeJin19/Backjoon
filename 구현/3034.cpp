#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int n, h, w, x;
	double max;

	cin >> n >> w >> h;

	max = w * w + h * h;
	max = sqrt(max);

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		if (x <= max)
		{
			cout << "DA\n";
		}
		else
		{
			cout << "NE\n";
		}
	}

	return 0;
}

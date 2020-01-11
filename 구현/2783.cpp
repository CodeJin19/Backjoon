#include <iostream>

using namespace std;

int main()
{
	int n;
	double x, y, min, z;

	cin >> x >> y;

	min = x / y * 1000;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;

		z = x / y * 1000;

		if (z < min)
		{
			min = z;
		}
	}
    
	cout << fixed;
	cout.precision(2);
	cout << min << endl;

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int n;
	double x, tmp, total;

	cin >> x;

	while (x != 0)
	{
		total = 0;
		n = 2;

		while (total < x)
		{
			tmp = 1;
			tmp /= n;
			total += tmp;
			n++;
		}

		cout << n - 2 << " card(s)\n";
		
		cin >> x;
	}
	return 0;
}

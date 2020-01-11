#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int n, x, cnt = 0;
	double y;
	
	cin >> n;

	for (int i = 1; i <= 500; i++)
	{
		y = i * i + n;
		y = sqrt(y);
		x = y;

		if (x == y)
		{
			cnt++;
		}
	}

	cout << cnt << endl;

	return 0;
}

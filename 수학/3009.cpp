#include <iostream>

using namespace std;

int main()
{
	int x, y;
	int xrr[2][2], yrr[2][2];

	for (int i = 0; i < 2; i++)
	{
		xrr[i][1] = 0;
		yrr[i][1] = 0;
	}

	cin >> xrr[0][0] >> yrr[0][0];

	xrr[0][1]++;
	yrr[0][1]++;

	for (int i = 0; i < 2; i++)
	{
		cin >> x >> y;

		if (x == xrr[0][0])
		{
			xrr[0][1]++;
		}
		else
		{
			xrr[1][0] = x;
			xrr[1][1]++;
		}

		if (y == yrr[0][0])
		{
			yrr[0][1]++;
		}
		else
		{
			yrr[1][0] = y;
			yrr[1][1]++;
		}
	}

	if (xrr[0][1] == 2)
	{
		cout << xrr[1][0] << " ";
	}
	else
	{
		cout << xrr[0][0] << " ";
	}

	if (yrr[0][1] == 2)
	{
		cout << yrr[1][0] << endl;
	}
	else
	{
		cout << yrr[0][0] << endl;
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int n, min, max, h, w;
	int xrr[20];
	int yrr[20];

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> xrr[i] >> yrr[i];
	}

	max = 0;
	min = 120;

	for (int i = 0; i < n; i++)
	{
		if (max < xrr[i])
		{
			max = xrr[i];
		}

		if (xrr[i] < min)
		{
			min = xrr[i];
		}
	}

	h = max - min;
	max = 0;
	min = 120;

	for (int i = 0; i < n; i++)
	{
		if (max < yrr[i])
		{
			max = yrr[i];
		}

		if (yrr[i] < min)
		{
			min = yrr[i];
		}
	}

	w = max - min;

	if (h < w)
	{
		cout << w * w << endl;
	}
	else
	{
		cout << h * h << endl;
	}

	return 0;
}

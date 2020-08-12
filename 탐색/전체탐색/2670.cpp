#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>

using namespace std;

int main()
{
	double x, max = 0;
	int n;
	vector <double> list;

	scanf("%d", &n);

	for (int i = 0; i < n; ++i)
	{
		scanf("%lf", &x);
		list.push_back(x);
	}

	for (int i = 0; i < n; ++i)
	{
		x = list[i];

		if (max < x)
			max = x;

		for (int j = i + 1; j < n; ++j)
		{
			x *= list[j];

			if (max < x)
				max = x;
		}
	}

	printf("%.3lf", max);

	return 0;
}

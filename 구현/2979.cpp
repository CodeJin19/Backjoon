#include <iostream>

using namespace std;

int main()
{
	int time[110];
	int a, b, c, from, to, min = 1000, max = 0, sum = 0;

	cin >> a >> b >> c;

	for (int i = 0; i < 110; i++)
	{
		time[i] = 0;
	}

	for (int i = 0; i < 3; i++)
	{
		cin >> from >> to;

		for (int j = from; j < to; j++)
			time[j] += 1;

		if (from < min)
			min = from;

		if (max < to)
			max = to;
	}

	for (int i = min; i <= max; i++)
	{
		switch (time[i])
		{
		case 0:
			break;
		case 1:
			sum += a;
			break;
		case 2:
			sum += (b * 2);
			break;
		case 3:
			sum += (c * 3);
			break;
		}
	}

	cout << sum << endl;
	
	return 0;
}

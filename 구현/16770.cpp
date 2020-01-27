#include <iostream>

using namespace std;

int main()
{
	int time[1010];
	int n, s, t, b, max = -1;

	for (int i = 0; i <= 1000; i++)
	{
		time[i] = 0;
	}

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> s >> t >> b;

		for (int j = s; j <= t; j++)
		{
			time[j] += b;
		}
	}

	for (int i = 0; i <= 1000; i++)
	{
		if (max < time[i])
		{
			max = time[i];
		}
	}

	cout << max << endl;

	return 0;
}

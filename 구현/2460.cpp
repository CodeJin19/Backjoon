#include <iostream>

using namespace std;

int main()
{
	int getin, getout;
	int now = 0;
	int max = -1;

	for (int i = 0; i < 10; i++)
	{
		cin >> getout >> getin;

		now -= getout;
		now += getin;

		if (max < now)
		{
			max = now;
		}
	}

	cout << max << endl;

	return 0;
}

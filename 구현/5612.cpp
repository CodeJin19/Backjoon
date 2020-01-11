#include <iostream>

using namespace std;

int main()
{
	int n, now, in, out;
	int max = 0;

	cin >> n >> now;

	for (int i = 0; i < n; i++)
	{
		cin >> in >> out;

		now = now + in - out;

		if (now < 0)
		{
			max = 0;
			i = n;
		}

		if (max < now)
		{
			max = now;
		}
	}

	cout << max << endl;

	return 0;
}

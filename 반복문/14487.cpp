#include <iostream>

using namespace std;

int main()
{
	int n, max = -1, sum = 0, x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		if (max < x)
		{
			max = x;
		}

		sum += x;
	}

	cout << sum - max << endl;

	return 0;
}

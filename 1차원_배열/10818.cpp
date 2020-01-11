#include <iostream>

using namespace std;

int main()
{
	int num, x;
	int min = 1000010;
	int max = -1000010;

	cin >> num;

	for (int i = 0; i < num; i++)
	{
		cin >> x;

		if (x < min)
		{
			min = x;
		}

		if (max < x)
		{
			max = x;
		}
	}

	cout << min << " " << max << endl;

	return 0;
}

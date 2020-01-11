#include <iostream>

using namespace std;

int main()
{
	int max = 0;
	int sum, x, idx;

	for (int i = 1; i < 6; i++)
	{
		sum = 0;

		for (int j = 0; j < 4; j++)
		{
			cin >> x;
			sum += x;
		}

		if (max < sum)
		{
			max = sum;
			idx = i;
		}
	}

	cout << idx << " " << max << endl;

	return 0;
}

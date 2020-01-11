#include <iostream>

using namespace std;

int main()
{
	int arr[20];
	int sum;
	int max = -1;

	for (int i = 0; i < 8; i++)
	{
		cin >> arr[i];
		arr[i + 8] = arr[i];
	}

	for (int i = 0; i < 8; i++)
	{
		sum = 0;

		for (int j = 0; j < 4; j++)
		{
			sum += arr[i + j];
		}

		if (max < sum)
		{
			max = sum;
		}
	}

	cout << max << endl;

	return 0;
}

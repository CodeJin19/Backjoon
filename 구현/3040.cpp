#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> arr;

	int n, sum = 0, x, y;

	for (int i = 0; i < 9; i++)
	{
		cin >> n;

		arr.push_back(n);
		sum += n;
	}

	sum -= 100;

	for (int i = 0; i < 9; i++)
	{
		for (int j = i + 1; j < 9; j++)
		{
			if (arr[i] + arr[j] == sum)
			{
				x = i;
				y = j;
				j = 10;
				i = 10;
			}
		}
	}

	for (int i = 0; i < 9; i++)
	{
		if (i != x && i != y)
		{
			cout << arr[i] << endl;
		}
	}

	return 0;
}

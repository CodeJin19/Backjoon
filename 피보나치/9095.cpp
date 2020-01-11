#include <iostream>

using namespace std;

int main()
{
	int t, n;
	int arr[15];
	int idx = 4;

	cin >> t;

	arr[1] = 1;
	arr[2] = 2;
	arr[3] = 4;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		if(idx <= n)
		{
			while (idx <= n)
			{
				arr[idx] = arr[idx - 1] + arr[idx - 2] + arr[idx - 3];
				idx++;
			}
		}

		cout << arr[n] << "\n";
	}

	return 0;
}

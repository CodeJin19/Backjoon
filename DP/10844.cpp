#include <iostream>

using namespace std;

int main()
{
	int arr[10];
	int nxt[10];
	int cnt = 1;
	int sum, n;

	arr[0] = 0;
	arr[1] = 1;
	arr[2] = 1;
	arr[3] = 1;
	arr[4] = 1;
	arr[5] = 1;
	arr[6] = 1;
	arr[7] = 1;
	arr[8] = 1;
	arr[9] = 1;

	cin >> n;

	while (cnt < n)
	{
		nxt[0] = arr[1];
		nxt[1] = arr[0] + arr[2];
		nxt[2] = arr[1] + arr[3];
		nxt[3] = arr[2] + arr[4];
		nxt[4] = arr[3] + arr[5];
		nxt[5] = arr[4] + arr[6];
		nxt[6] = arr[5] + arr[7];
		nxt[7] = arr[6] + arr[8];
		nxt[8] = arr[7] + arr[9];
		nxt[9] = arr[8];

		for (int i = 0; i < 10; i++)
		{
			arr[i] = nxt[i] % 1000000000;
		}

		cnt++;
	}

	sum = arr[0];

	for (int i = 1; i < 10; i++)
	{
		sum += arr[i];
		sum %= 1000000000;
	}

	cout << sum << endl;

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int x;
	int idx = 0;
	int cnt[30];
	char arr[110];

	cin >> arr;

	for (int i = 0; i < 30; i++)
	{
		cnt[i] = -1;
	}

	while (arr[idx] != '\0')
	{
		x = arr[idx] - 'a';

		if (cnt[x] == -1)
		{
			cnt[x] = idx;
		}

		idx++;
	}

	for (int i = 0; i < 26; i++)
	{
		cout << cnt[i] << " ";
	}
	cout << "\n";

	return 0;
}

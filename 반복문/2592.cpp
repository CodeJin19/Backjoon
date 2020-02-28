#include <iostream>

using namespace std;

int main()
{
	int cnt[110], x, sum = 0, idx, max = -1;

	for (int i = 0; i < 110; i++)
		cnt[i] = 0;

	for (int i = 0; i < 10; i++)
	{
		cin >> x;

		sum += x;

		x /= 10;
		cnt[x] += 1;

		if (max < cnt[x])
		{
			max = cnt[x];
			idx = x;
		}
	}

	cout << sum / 10 << endl << idx * 10 << endl;

	return 0;
}

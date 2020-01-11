#include <iostream>

using namespace std;

int main()
{
	int n, idx, cnt;
	int pri[250000];

	cin >> n;

	//소수 찾기
	pri[0] = 2;
	idx = 1;

	for (int i = 2; i <= 250000; i++)
	{
		pri[i] = 1;
	}

	for (int i = 2; i <= 250000; i++)
	{
		if (pri[i] == 1)
		{
			idx = i + i;

			while (idx <= 250000)
			{
				pri[idx] = 0;
				idx += i;
			}
		}
	}

	while (n != 0)
	{
		cnt = 0;

		for (int i = n + 1; i <= 2 * n; i++)
		{
			if (pri[i] == 1)
			{
				cnt += pri[i];
			}
		}

		cout << cnt << "\n";

		cin >> n;
	}

	return 0;
}

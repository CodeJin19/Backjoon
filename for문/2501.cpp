#include <iostream>

using namespace std;

int main()
{
	int k, n, cnt = 0;
	bool flag = true;

	cin >> n >> k;

	for (int i = 1; i <= n; i++)
	{
		if (n % i == 0)
		{
			cnt++;

			if (cnt == k)
			{
				cout << i << endl;
				flag = false;
				i = 2100000000;
			}
		}
	}

	if (flag)
		cout << "0\n";

	return 0;
}

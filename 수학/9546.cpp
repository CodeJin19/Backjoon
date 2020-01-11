#include <iostream>

using namespace std;

int main()
{
	int t, k, ans, cnt;

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		cin >> k;

		ans = 1;
		cnt = 1;

		while (cnt < k)
		{
			ans *= 2;
			ans++;
			cnt++;
		}

		cout << ans << endl;
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int t, a, b, ans, cnt;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> a >> b;

		cnt = -1;
		ans = 0;

		for (int i = 0; i < a / b; i++)
		{
			cnt += 2;
			ans += cnt;
		}

		cout << ans << endl;
	}

	return 0;
}

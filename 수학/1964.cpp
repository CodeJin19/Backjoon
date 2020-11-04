#include <iostream>

using namespace std;

int main()
{
	int n, ans, d;

	cin >> n;

	ans = 1;
	d = 1;

	for (int i = 0; i < n; ++i)
	{
		for (int j = 0; j < 3; ++j)
		{
			ans += d;
			ans %= 45678;
		}

		ans += 1;
		ans %= 45678;
		d++;
	}

	cout << ans << endl;

	return 0;
}

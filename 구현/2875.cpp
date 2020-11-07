#include <iostream>

using namespace std;

int main()
{
	int n, m, k, r, ans;

	cin >> n >> m >> k;

	if (n / 2 <= m)
	{
		ans = n / 2;
		r = n + m - (3 * ans);
	}
	else
	{
		ans = m;
		r = n + m - (3 * ans);
	}

	if (k <= r)
	{
		cout << ans << endl;
	}
	else
	{
		r = k - r;
		ans = ans - (r / 3);

		if (r % 3 != 0)
		{
			ans--;
		}

		cout << ans << endl;
	}

	return 0;
}

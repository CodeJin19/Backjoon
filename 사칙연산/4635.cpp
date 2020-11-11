#include <iostream>

using namespace std;

int main()
{
	int n, s, t, b, m, ans;

	cin >> n;

	while (n != -1)
	{
		b = 0;
		ans = 0;

		for (int i = 0; i < n; ++i)
		{
			cin >> s >> t;

			ans += (s * (t - b));
			b = t;
		}
		
		cout << ans << " miles\n";

		cin >> n;
	}

	return 0;
}

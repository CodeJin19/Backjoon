#include <iostream>

using namespace std;

int main()
{
	int t, n, c, r, ans;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n >> c;

		ans = n / c;
		r = n % c;

		if (r != 0)
		{
			ans++;
		}

		cout << ans << endl;
	}

	return 0;
}

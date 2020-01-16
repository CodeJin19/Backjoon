#include <iostream>

using namespace std;

int main()
{
	int n, m, k, ans;

	cin >> n >> m >> k;

	if (m <= k)
	{
		ans = m;
	}
	else
	{
		ans = k;
	}

	if ((n - m) <= (n - k))
	{
		ans += (n - m);
	}
	else
	{
		ans += (n - k);
	}

	cout << ans << endl;

	return 0;
}

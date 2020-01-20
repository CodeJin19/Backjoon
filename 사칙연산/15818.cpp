#include <iostream>

using namespace std;

int main()
{
	int n, m;
	long long x, ans = 1;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		x %= m;
		ans *= x;
		ans %= m;
	}

	cout << ans << endl;

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int n, x, y;
	int ans = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;

		ans += (y % x);
	}

	cout << ans << endl;

	return 0;
}

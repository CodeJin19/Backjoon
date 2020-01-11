#include <iostream>

using namespace std;

int main()
{
	int n, c, k, ans = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> c >> k;
		ans += (c * k);
	}

	cout << ans << endl;

	return 0;
}

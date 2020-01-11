#include <iostream>

using namespace std;

int main()
{
	int s, t, d, ans;

	cin >> s >> t >> d;

	ans = 2 * s;
	ans = d / ans;
	ans *= t;

	cout << ans << endl;

	return 0;
}

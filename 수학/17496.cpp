#include <iostream>

using namespace std;

int main()
{
	int n, t, c, p, ans;

	cin >> n >> t >> c >> p;

	n -= t;
	n--;
	n /= t;
	n++;

	ans = n * c;
	ans *= p;

	cout << ans << endl;

	return 0;
}

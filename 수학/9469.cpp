#include <iostream>

using namespace std;

int main()
{
	int t, n;
	double ans, d, a, b, f;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n >> d >> a >> b >> f;

		ans = a + b;
		ans = d / ans;
		ans *= f;

		cout.precision(6);
		cout << n << " " << fixed << ans << endl;
	}

	return 0;
}

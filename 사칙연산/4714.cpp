#include <iostream>

using namespace std;

int main()
{
	double r = 0.167;
	double x, ans;

	cin >> x;

	cout << fixed;
	cout.precision(2);

	while (x != -1.0)
	{
		ans = x * r;

		cout << "Objects weighing " << x << " on Earth will weigh " << ans << " on the moon.\n";

		cin >> x;
	}

	return 0;
}

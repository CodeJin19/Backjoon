#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int T, n, x;
	int ans = 0;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> n;

		x = n % 10;
		n /= 10;

		ans += pow(n, x);
	}

	cout << ans << endl;

	return 0;
}

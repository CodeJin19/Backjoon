#include <iostream>

using namespace std;

int main()
{
	int n, ans;

	cin >> n;

	if (n == 3)
	{
		cout << "0\n";
	}
	else
	{
		ans = n * (n - 1);
		ans /= 2;
		ans *= (n - 2);
		ans /= 3;
		ans *= (n - 3);
		ans /= 4;

		cout << ans << endl;
	}

	return 0;
}

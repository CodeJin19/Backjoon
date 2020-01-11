#include <iostream>

using namespace std;

int main()
{
	int n, ans;

	cin >> n;

	if (n % 2 == 0)
	{
		ans = n / 2;
		ans++;
		ans *= ans;
	}
	else
	{
		ans = n - 1;
		ans /= 2;
		ans++;
		ans = ans * ans + ans;
	}

	cout << ans << endl;

	return 0;
}

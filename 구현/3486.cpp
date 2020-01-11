#include <iostream>

using namespace std;

int reverse(int num)
{
	int ans = 0;

	while (num != 0)
	{
		ans *= 10;
		ans += (num % 10);
		num /= 10;
	}

	return ans;
}

int main()
{
	int T, a, b, c, d, ans;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> a >> b;

		cout << reverse(reverse(a) + reverse(b)) << endl;
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int n, ans, x;

	cin >> n;

	while (n)
	{
		ans = 1;

		while (n)
		{
			x = n % 10;
			n /= 10;

			switch (x)
			{
			case 1:
				ans += 2;
				break;
			case 0:
				ans += 4;
				break;
			default:
				ans += 3;
				break;
			}

			ans++;
		}

		cout << ans << "\n";
		cin >> n;
	}

	return 0;
}

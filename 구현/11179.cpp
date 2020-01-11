#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n, r, ans = 0, x, digit = 1;
	string s = "";

	cin >> n;

	while (n != 0)
	{
		r = n % 2;
		n /= 2;

		if (r == 1)
		{
			s += '1';
		}
		else
		{
			s += '0';
		}
	}

	for (int i = s.length() - 1; 0 <= i; i--)
	{
		if (s[i] == '1')
		{
			ans += digit;
		}

		digit *= 2;
	}

	cout << ans << endl;

	return 0;
}

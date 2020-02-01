#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int x = 0, dig = 1, n;

	cin >> s;

	for (int i = s.length() - 1; 0 <= i; i--)
	{
		if ('0' <= s[i] && s[i] <= '9')
		{
			n = s[i] - '0';
		}
		else
		{
			n = s[i] - 'A';
			n += 10;
		}

		x += (dig * n);
		dig *= 16;
	}

	cout << x << endl;

	return 0;
}

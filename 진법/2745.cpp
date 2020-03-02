#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s;
	int n = 0, d = 1, len, jin, x;

	cin >> s >> jin;

	len = s.length();

	for (int i = 1; i <= len; i++)
	{
		if ('A' <= s[len - i] && s[len - i] <= 'Z')
		{
			x = s[len - i] - 'A';
			x += 10;
		}
		else
		{
			x = s[len - i] - '0';
		}

		n += (x * d);
		d *= jin;
	}

	cout << n << endl;

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	string s = "";
	int n, jin, x, r;

	cin >> n >> jin;

	while (n != 0)
	{
		r = n % jin;

		if (10 <= r)
		{
			r -= 10;
			s += (r + 'A');
		}
		else
			s += (r + '0');

		n /= jin;
	}

	for (int i = s.length() - 1; 0 <= i; i--)
		cout << s[i];

	return 0;
}

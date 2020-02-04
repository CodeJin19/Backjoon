#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int x;

	cin >> s;

	for (int i = 0; i < s.length(); i++)
	{
		x = s[i] - 'A';
		x -= 3;

		if (x < 0)
		{
			x += 26;
		}

		s[i] = (char)('A' + x);
	}

	cout << s << endl;

	return 0;
}

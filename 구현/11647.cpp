#include <iostream>
#include <string>

using namespace std;

void translate(int level, string s, int x, int y)
{
	if (level == s.length())
	{
		cout << " " << x << " " << y;
		return;
	}
	else
	{
		x *= 2;
		y *= 2;

		switch (s[level])
		{
		case '0':
			translate(level + 1, s, x, y);
			break;
		case '1':
			translate(level + 1, s, x + 1, y);
			break;
		case '2':
			translate(level + 1, s, x, y + 1);
			break;
		case '3':
			translate(level + 1, s, x + 1, y + 1);
			break;
		}
	}
}

int main()
{
	string s;

	cin >> s;

	cout << s.length();

	translate(0, s, 0, 0);

	return 0;
}

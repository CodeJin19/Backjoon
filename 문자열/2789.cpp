#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;

	cin >> s;

	for (int i = 0; i < s.length(); i++)
	{
		switch (s[i])
		{
		case 'C':
		case 'A':
		case 'M':
		case 'B':
		case 'R':
		case 'I':
		case 'D':
		case 'G':
		case 'E':
			break;
		default:
			cout << s[i];
			break;
		}
	}

	return 0;
}

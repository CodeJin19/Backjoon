#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int total = 0;

	cin >> s;

	for (int i = 0; i < s.size(); i++)
	{
		switch (s[i])
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			total++;
			break;
		default:
			break;
		}
	}

	cout << total << endl;

	return 0;
}

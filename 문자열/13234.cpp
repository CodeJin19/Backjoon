#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s1, s2, o;

	cin >> s1 >> o >> s2;

	if (o[0] == 'A')
	{
		if (s1[0] == 't' && s2[0] == 't')
		{
			cout << "true\n";
		}
		else
		{
			cout << "false\n";
		}
	}
	else
	{
		if (s1[0] == 't' || s2[0] == 't')
		{
			cout << "true\n";
		}
		else
		{
			cout << "false\n";
		}
	}

	return 0;
}

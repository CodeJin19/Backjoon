#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	bool flag = true;

	cin >> s;

	for (int i = 0; i < s.length() / 2; i++)
	{
		if (s[i] != s[s.length() - 1 - i])
		{
			flag = false;
			break;
		}
	}

	if (flag)
	{
		cout << "1\n";
	}
	else
	{
		cout << "0\n";
	}

	return 0;
}

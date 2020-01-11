#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int cnt;
	cin >> s;

	while (s != "#")
	{
		cnt = 0;

		for (int i = 0; i < s.length() - 1; i++)
		{
			if (s[i] == '1')
			{
				cnt++;
			}
		}

		if (s[s.length() - 1] == 'e')
		{
			if (cnt % 2 == 0)
			{
				s[s.length() - 1] = '0';
			}
			else
			{
				s[s.length() - 1] = '1';
			}
		}
		else
		{
			if (cnt % 2 == 0)
			{
				s[s.length() - 1] = '1';
			}
			else
			{
				s[s.length() - 1] = '0';
			}
		}

		cout << s << "\n";

		cin >> s;
	}

	return 0;
}

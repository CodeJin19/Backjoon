#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int len, cnt;

	getline(cin, s);
	len = s.length();

	while (s[0] != '#' || len != 1)
	{
		cnt = 0;

		for (int i = 0; i < len; ++i)
		{
			if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
			{
				cnt++;
			}
			else if (s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
			{
				cnt++;
			}
		}

		cout << cnt << endl;
		
		getline(cin, s);
		len = s.length();
	}

	return 0;
}

#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int n, x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> s;

		for (int j = 0; j < s.length(); j++)
		{
			if ('A' <= s[j] && s[j] <= 'Z')
			{
				x = s[j] - 'A' + 'a';
				s[j] = (char) x;
			}
		}

		cout << s << "\n";
	}

	return 0;
}

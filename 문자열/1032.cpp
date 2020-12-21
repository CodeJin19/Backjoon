#include <iostream>
#include <string>

using namespace std;

int main()
{
	string ans, s;
	int t, len;

	cin >> t;
	cin >> ans;

	len = ans.length();

	for (int i = 1; i < t; i++)
	{
		cin >> s;

		for (int j = 0; j < len; j++)
		{
			if (ans[j] != '?')
			{
				if (ans[j] != s[j])
				{
					ans[j] = '?';
				}
			}
		}
	}

	cout << ans << endl;

	return 0;
}

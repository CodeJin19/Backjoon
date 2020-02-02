#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	bool flag;
	int ans = 10;

	cin >> s;

	if (s[0] == '(')
	{
		flag = true;
	}
	else
	{
		flag = false;
	}

	for (int i = 1; i < s.length(); i++)
	{
		if (flag)
		{
			if (s[i] == '(')
			{
				ans += 5;
			}
			else
			{
				ans += 10;
				flag = false;
			}
		}
		else
		{
			if (s[i] == ')')
			{
				ans += 5;
			}
			else
			{
				ans += 10;
				flag = true;
			}
		}
	}

	cout << ans << endl;

	return 0;
}

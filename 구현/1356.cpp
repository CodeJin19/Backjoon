#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int len, idx, a, b;
	bool flag = false;

	cin >> s;
	
	len = s.length();
	idx = 1;

	while (!flag && idx < len)
	{
		a = 1;
		b = 1;

		for (int i = 0; i < idx; i++)
		{
			a *= (int)(s[i] - '0');
		}

		for (int i = idx; i < len; i++)
		{
			b *= (int)(s[i] - '0');
		}

		if (a == b)
		{
			flag = true;
		}

		idx++;
	}
	
	if (flag)
	{
		cout << "YES\n";
	}
	else
	{
		cout << "NO\n";
	}

	return 0;
}

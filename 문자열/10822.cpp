#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int sum = 0, x;
	bool flag = true;

	cin >> s;

	for (int i = 0; i < s.length(); i++)
	{
		if (s[i] != ',')
		{
			if (flag)
			{
				x = s[i] - '0';
				flag = false;
			}
			else
			{
				x *= 10;
				x += s[i] - '0';
			}
		}
		else
		{
			sum += x;
			flag = true;
		}
	}

	sum += x;
	cout << sum << endl;

	return 0;
}

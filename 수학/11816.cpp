#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int x = 0, n;

	cin >> s;

	if (s[0] == '0')
	{
		if (s[1] == 'x')  //16진수
		{
			for (int i = 2; i < s.length(); i++)
			{
				if ('0' <= s[i] && s[i] <= '9')
				{
					n = s[i] - '0';
				}
				else
				{
					n = s[i] - 'a';
					n += 10;
				}
				
				x += n;
				x *= 16;
			}

			x /= 16;
		}
		else  //8진수
		{
			for (int i = 1; i < s.length(); i++)
			{
				n = s[i] - '0';
				x += n;
				x *= 8;
			}

			x /= 8;
		}
	}
	else
	{
		for (int i = 0; i < s.length(); i++)
		{
			n = s[i] - '0';
			x += n;
			x *= 10;
		}

		x /= 10;
	}

	cout << x << endl;

	return 0;
}

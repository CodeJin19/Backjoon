#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>

using namespace std;

bool isSub(string s, int len, int idx)
{
	if (len == idx)
	{
		return true;
	}

	if (s[idx] == '1') //100~1~
	{
		if (s[idx + 1] == '0' && s[idx + 2] == '0')
		{
			idx += 2;

			while (idx < len && s[idx] == '0')
				++idx;

			if (idx == len)
			{
				return false;
			}
			else
			{
				while (idx < len && s[idx] == '1')
				{
					++idx;

					if (isSub(s, len, idx))
					{
						return true;
					}
				}
			}

		}
		else
		{
			return false;
		}
	}
	else //01
	{
		if (s[idx + 1] != '1')
		{
			return false;
		}
		else
		{
			if (isSub(s, len, idx + 2))
			{
				return true;
			}
		}
	}

	return false;
}

int main()
{
	int len;
	bool flag = true;
	string s;

	cin >> s;

	len = s.length();

	if (isSub(s, len, 0))
		cout << "SUBMARINE\n";
	else
		cout << "NOISE\n";

	return 0;
}

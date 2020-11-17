#include <iostream>
#include <string>

using namespace std;

int swap(string s)
{
	if (s[0] == 'b')
	{
		if (s[2] == 'a')
		{
			return 0;
		}
		else if (s[2] == 'o')
		{
			return 1;
		}
		else
		{
			return 6;
		}
	}
	else if (s[0] == 'r')
	{
		return 2;
	}
	else if (s[0] == 'o')
	{
		return 3;
	}
	else if (s[0] == 'y')
	{
		return 4;
	}
	else if (s[0] == 'g')
	{
		if (s[3] == 'e')
		{
			return 5;
		}
		else
		{
			return 8;
		}
	}
	else if (s[0] == 'v')
	{
		return 7;
	}
	else
	{
		return 9;
	}
}

int main()
{
	long long num = 0;
	int l;
	string s1, s2, s3;

	cin >> s1 >> s2 >> s3;

	num = swap(s1);
	num *= 10;
	num += swap(s2);

	l = swap(s3);

	for (int i = 0; i < l; ++i)
	{
		num *= 10;
	}

	cout << num << endl;

	return 0;
}

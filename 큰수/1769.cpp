#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

string aPlusB(string a, string b)
{
	int aLen = a.length();
	int bLen = b.length();
	int sum;
	bool carry;
	string ans;

	reverse(a.begin(), a.end());
	reverse(b.begin(), b.end());

	if (aLen < bLen)
	{
		carry = false;

		for (int i = 0; i < aLen; ++i)
		{
			sum = (a[i] - '0') + (b[i] - '0');

			if (carry)
				sum += 1;

			if (9 < sum)
			{
				sum %= 10;
				carry = true;
			}
			else
			{
				carry = false;
			}

			ans += (char)(sum + '0');
		}

		for (int i = aLen; i < bLen; ++i)
		{
			sum = (b[i] - '0');

			if (carry)
				sum += 1;

			if (9 < sum)
			{
				sum %= 10;
				carry = true;
			}
			else
			{
				carry = false;
			}

			ans += (char)(sum + '0');
		}

		if (carry)
			ans += '1';

		reverse(ans.begin(), ans.end());
	}
	else if (aLen == bLen)
	{
		carry = false;

		for (int i = 0; i < aLen; ++i)
		{
			sum = (a[i] - '0') + (b[i] - '0');

			if (carry)
				sum += 1;

			if (9 < sum)
			{
				sum %= 10;
				carry = true;
			}
			else
			{
				carry = false;
			}

			ans += (char)(sum + '0');
		}

		if (carry)
			ans += '1';

		reverse(ans.begin(), ans.end());
	}
	else
	{
		carry = false;

		for (int i = 0; i < bLen; ++i)
		{
			sum = (a[i] - '0') + (b[i] - '0');

			if (carry)
				sum += 1;

			if (9 < sum)
			{
				sum %= 10;
				carry = true;
			}
			else
			{
				carry = false;
			}

			ans += (char)(sum + '0');
		}

		for (int i = bLen; i < aLen; ++i)
		{
			sum = (a[i] - '0');

			if (carry)
				sum += 1;

			if (9 < sum)
			{
				sum %= 10;
				carry = true;
			}
			else
			{
				carry = false;
			}

			ans += (char)(sum + '0');
		}

		if (carry)
			ans += '1';

		reverse(ans.begin(), ans.end());
	}

	return ans;
}

int main()
{
    string s;
    int len = 0, cnt = 0, a;

    cin >> s;

    len = s.length();

    while (1 < len)
    {
        string tmp = "0";

        for (int i = 0; i < len; ++i)
        {
            tmp = aPlusB(tmp, s.substr(i, 1));
        }

        cnt++;
        s = tmp;
        len = s.length();
    }

    cout << cnt << endl;
    
    if(s.compare("3") == 0 || s.compare("6") == 0 || s.compare("9") == 0)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }

    return 0;
}

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int isBigger(string a, string b)
{
	int aLen = a.length();
	int bLen = b.length();

	if (bLen < aLen)
	{
		return 1;
	}
	else if (aLen == bLen)
	{
		for (int i = 0; i < aLen; ++i)
			if (b[i] < a[i])
				return 1;
			else if (a[i] < b[i])
				return -1;

		return 0;
	}
	else
	{
		return -1;
	}
}

string aMinusBWithoutCompare(string a, string b)
{

	int aLen = a.length();
	int bLen = b.length();
	int sum, compare;
	bool carry;
	string ans;

	reverse(a.begin(), a.end());
	reverse(b.begin(), b.end());

	carry = false;

	for (int i = 0; i < bLen; ++i)
	{
		sum = (a[i] - '0') - (b[i] - '0');

		if (carry)
			sum--;

		if (sum < 0)
		{
			sum += 10;
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
			sum--;

		if (sum < 0)
		{
			sum += 10;
			carry = true;
		}
		else
		{
			carry = false;
		}

		ans += (char)(sum + '0');
	}

	carry = false;

	for (int i = aLen - 1; 0 <= i; --i)
	{
		if (ans[i] != '0')
		{
			ans = ans.substr(0, i + 1);
			carry = true;
			i = -1;
		}
	}

	if (!carry)
	{
		return "0";
	}
	else
	{
		reverse(ans.begin(), ans.end());
		return ans;
	}
}

string aDivedsByBInt(string a, string b, string * rem)
{
	int aLen = a.length();
	int bLen = b.length();
	int compare = isBigger(a, b);
	int cnt;
	bool isFirst = true;
	string ans, tmp;

	if (compare == 1)
	{
		ans = "";
		tmp = "";

		for (int i = 0; i < aLen; ++i)
		{
			tmp += a[i];
			cnt = 0;

			while (0 <= isBigger(tmp, b))
			{
				tmp = aMinusBWithoutCompare(tmp, b);
				cnt++;
			}

			ans += (char)(cnt + '0');

			if (tmp.compare("0") == 0 && i != aLen - 1)
			{
				tmp = "";
			}
		}

		aLen = ans.length();

		for (int i = 0; i < aLen; ++i)
		{
			if (ans[i] != '0')
			{
				ans = ans.substr(i, aLen);
				i = aLen;
			}
		}

		*rem = tmp;
	}
	else if (compare == 0)
	{
		ans = "1";
		*rem = "0";
	}
    else
    {
		ans = "0";
		*rem = a;
    }

	return ans;
}

int main()
{
	string a, b, rem;

	cin >> a >> b;

	cout << aDivedsByBInt(a, b, &rem) << endl;
	cout << rem << endl;

	return 0;
}

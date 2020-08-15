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

string aMinusB(string a, string b)
{
	int aLen = a.length();
	int bLen = b.length();
	int sum, compare;
	bool carry;
	string ans;

	compare = isBigger(a, b);
	reverse(a.begin(), a.end());
	reverse(b.begin(), b.end());

	if (compare == 1) // positive;
	{
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

		for (int i = aLen - 1; 0 <= i; --i)
		{
			if (ans[i] != '0')
			{
				ans = ans.substr(0, i + 1);
				i = -1;
			}
		}

		reverse(ans.begin(), ans.end());
	}
	else if (compare == 0)
	{
		return "0";
	}
	else // 3 - 123
	{
		carry = false;

		for (int i = 0; i < aLen; ++i)
		{
			sum = (b[i] - '0') - (a[i] - '0');

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

		for (int i = aLen; i < bLen; ++i)
		{
			sum = (b[i] - '0');

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

		for (int i = bLen - 1; 0 <= i; --i)
		{
			if (ans[i] != '0')
			{
				ans = ans.substr(0, i + 1);
				i = -1;
			}
		}

		ans += "-";

		reverse(ans.begin(), ans.end());
	}

	return ans;
}

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

string sub(string a, string b)
{
	int aLen, bLen;
	string ans, atmp, btmp;

	if (a[0] == '-')
	{
		if (b[0] == '-') // - - -
		{
			aLen = a.length();
			atmp = a.substr(1, aLen);

			bLen = b.length();
			btmp = b.substr(1, bLen);

			ans = aMinusB(btmp, atmp);
		}
		else // - - +
		{
			aLen = a.length();
			atmp = a.substr(1, aLen);

			ans = "-";
			ans.append(aPlusB(atmp, b));
		}
	}
	else
	{
		if (b[0] == '-') // + - -
		{
			bLen = b.length();
			btmp = b.substr(1, bLen);

			ans = aPlusB(a, btmp);
		}
		else // + - +
		{
			ans = aMinusB(a, b);
		}
	}

	return ans;
}

string add(string a, string b)
{
	int aLen, bLen;
	string ans, atmp, btmp;

	if (a[0] == '-')
	{
		if (b[0] == '-') // - + -
		{
			aLen = a.length();
			atmp = a.substr(1, aLen);

			bLen = b.length();
			btmp = b.substr(1, bLen);

			ans = "-";
			ans.append(aPlusB(atmp, btmp));
		}
		else // - + +
		{
			aLen = a.length();
			atmp = a.substr(1, aLen);

			ans = aMinusB(b, atmp);
		}
	}
	else
	{
		if (b[0] == '-') // + + -
		{
			bLen = b.length();
			btmp = b.substr(1, bLen);

			ans = aMinusB(a, btmp);
		}
		else // + + +
		{
			ans = aPlusB(a, b);
		}
	}

	return ans;
}

string aTimesB(string a, string b)
{
	int aLen = a.length();
	int bLen = b.length();
	int sum, carry, len, idx;
	string ans = "0", tmp;

	reverse(a.begin(), a.end());
	reverse(b.begin(), b.end());

	if (aLen <= bLen)
	{
		for (int i = 0; i < aLen; ++i)
		{
			tmp = "";
			carry = 0;

			for (int j = 0; j < i; ++j)
			{
				tmp += "0";
			}

			for (int j = 0; j < bLen; ++j)
			{
				sum = (a[i] - '0') * (b[j] - '0');
				sum += carry;

				if (9 < sum)
				{
					carry = sum / 10;
					sum %= 10;
				}
				else
				{
					carry = 0;
				}

				tmp += (char)(sum + '0');
			}

			if (0 < carry)
				tmp += (char)(carry + '0');

			reverse(tmp.begin(), tmp.end());
			ans = add(ans, tmp);
		}
	}
	else
	{
		for (int i = 0; i < bLen; ++i)
		{
			tmp = "";
			carry = 0;

			for (int j = 0; j < i; ++j)
			{
				tmp += "0";
			}

			for (int j = 0; j < aLen; ++j)
			{
				sum = (a[j] - '0') * (b[i] - '0');
				sum += carry;

				if (9 < sum)
				{
					carry = sum / 10;
					sum %= 10;
				}
				else
				{
					carry = 0;
				}

				tmp += (char)(sum + '0');
			}

			if (0 < carry)
				tmp += (char)(carry + '0');

			reverse(tmp.begin(), tmp.end());
			ans = add(ans, tmp);
		}
	}

	if (ans[0] == '0')
		ans = "0";

	return ans;
}

string mul(string a, string b)
{
	int aLen, bLen;
	string ans, atmp, btmp, tmp;

	if (a[0] == '-')
	{
		if (b[0] == '-') // - * -
		{
			aLen = a.length();
			atmp = a.substr(1, aLen);

			bLen = b.length();
			btmp = b.substr(1, bLen);

			ans = aTimesB(atmp, btmp);
		}
		else // - * +
		{
			aLen = a.length();
			atmp = a.substr(1, aLen);

			tmp = aTimesB(atmp, b);

			if (tmp.length() == 1 && tmp[0] == '0')
			{
				ans = tmp;
			}
			else
			{
				ans = "-";
				ans.append(tmp);
			}
		}
	}
	else
	{
		if (b[0] == '-') // + * -
		{
			bLen = b.length();
			btmp = b.substr(1, bLen);

			tmp = aTimesB(a, btmp);

			if (tmp.length() == 1 && tmp[0] == '0')
			{
				ans = tmp;
			}
			else
			{
				ans = "-";
				ans.append(tmp);
			}
		}
		else // + * +
		{
			ans = aTimesB(a, b);
		}
	}

	return ans;
}

int main()
{
	string a, b;

	cin >> a >> b;

	cout << add(a, b) << endl;
	cout << sub(a, b) << endl;
	cout << mul(a, b) << endl;

	return 0;
}

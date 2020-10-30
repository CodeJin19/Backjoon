#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <stdio.h>
#include <vector>
#include <string>
#include <math.h>
#include <algorithm>
#include <queue>
#include <map>
#include <tuple>
#include <deque>

using namespace std;
class bigint
{
private:

	string aMinusB(string a, string b)
	{
		int aLen = a.length();
		int bLen = b.length();
		int sum, compare;
		bool carry;
		string ans;

		compare = this->compare(a, b);
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

public:
	int compare(string a, string b)
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
};

int main()
{
	bigint x;
	string s, ans;
	int n;

	for (int itr = 0; itr < 3; ++itr)
	{
		cin >> n;
		ans = "0";

		for (int i = 0; i < n; ++i)
		{
			cin >> s;

			ans = x.add(ans, s);
		}

		if (ans[0] == '-')
		{
			cout << "-\n";
		}
		else if (ans[0] == '0')
		{
			cout << "0\n";
		}
		else
		{
			cout << "+\n";
		}
	}
}

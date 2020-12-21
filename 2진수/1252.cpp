#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	string x, y, ans = "";
	int xLen, yLen, ansLen, a, b, c;
	bool carry, flag;

	cin >> x >> y;

	reverse(x.begin(), x.end());
	reverse(y.begin(), y.end());

	xLen = x.length();
	yLen = y.length();

	if (xLen < yLen)
	{
		while (xLen < yLen)
		{
			x += "0";
			xLen++;
		}
	}
	else if (yLen < xLen)
	{
		while (yLen < xLen)
		{
			y += "0";
			yLen++;
		}
	}

	carry = false;

	for (int i = 0; i < yLen; i++)
	{
		a = (int)(x[i] - '0');
		b = (int)(y[i] - '0');

		c = a + b;

		if (carry)
		{
			c++;
		}

		if (1 < c)
		{
			carry = true;
			c -= 2;
		}
		else
		{
			carry = false;
		}

		ans += (char)(c + '0');
	}

	if (carry)
	{
		ans += "1";
	}

	reverse(ans.begin(), ans.end());

	ansLen = ans.length();
	flag = true;

	for (int i = 0; i < ansLen; i++)
	{
		if(ans[i] == '0' && flag)
		{

		}
		else
		{
			flag = false;
			cout << ans[i];
		}
	}

	if (flag)
	{
		cout << "0";
	}

	cout << endl;

	return 0;
}

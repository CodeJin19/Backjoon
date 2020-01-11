#include <iostream>

using namespace std;

int main()
{
	int a, b, c, d, e, ans;

	cin >> a >> b >> c >> d >> e;

	if (d < e)
	{
		ans = d - 50;
	}
	else
	{
		ans = e - 50;
	}

	if (a < b)
	{
		if (c < a)
		{
			ans += c;
		}
		else
		{
			ans += a;
		}
	}
	else
	{
		if (c < b)
		{
			ans += c;
		}
		else
		{
			ans += b;
		}
	}

	cout << ans << endl;

	return 0;
}

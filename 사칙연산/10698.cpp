#include <iostream>

using namespace std;

int main()
{
	int t, x, y, ans;
	char o, e;
	bool flag;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> x >> o >> y >> e >> ans;

		if (o == '+')
		{
			if (ans == x + y)
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
		else
		{
			if (ans == x - y)
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}

		if (flag)
		{
			cout << "Case " << itr + 1 << ": YES\n";
		}
		else
		{
			cout << "Case " << itr + 1 << ": NO\n";
		}
	}

	return 0;
}

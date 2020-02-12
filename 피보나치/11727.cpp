#include <iostream>

using namespace std;

int main()
{
	int n, prev, pprev, now;

	cin >> n;

	if (n == 1)
	{
		cout << "1\n";
	}
	else if (n == 2)
	{
		cout << "3\n";
	}
	else
	{
		pprev = 1;
		prev = 3;
		
		for (int i = 0; i < n - 2; i++)
		{
			now = pprev * 2 + prev;
			now %= 10007;

			pprev = prev;
			prev = now;
		}

		cout << now << endl;
	}

	return 0;
}

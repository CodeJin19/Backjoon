#include <iostream>

using namespace std;

int fun[11];

int solve(int n)
{
	int x, y;

	if (fun[n] == -1)
	{
		if (n % 2== 0)
		{
			x = n / 2;

			fun[n] = x * x + 2 * solve(x);
		}
		else
		{
			x = n / 2;
			y = x + 1;

			fun[n] = x * y + solve(x) + solve(y);
		}
	}

	return fun[n];
}

int main()
{
	int n;

	cin >> n;

	for (int i = 0; i < 11; i++)
	{
		fun[i] = -1;
	}

	fun[0] = 0;
	fun[1] = 0;

	cout << solve(n) << endl;

	return 0;
}

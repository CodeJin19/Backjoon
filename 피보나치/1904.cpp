#include <iostream>

using namespace std;

int main()
{
	int n, f1, f2, f3;

	cin >> n;

	if (n == 1)
		cout << "1\n";
	else if (n == 2)
		cout << "2\n";
	else
	{
		f1 = 1;
		f2 = 2;

		for (int i = 2; i < n; i++)
		{
			f3 = f1 + f2;
			f3 %= 15746;
			f1 = f2;
			f2 = f3;
		}

		cout << f3 << "\n";
	}

	return 0;
}

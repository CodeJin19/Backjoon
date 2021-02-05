#include <iostream>

using namespace std;

int main()
{
	int n, x, cnt = 1;

	cin >> n;

	while (n != 0)
	{
		x = n * 3;

		if (x % 2 == 0)
		{
			cout << cnt << ". even ";
		}
		else
		{
			cout << cnt << ". odd ";
			x++;
		}

		x /= 2;
		x *= 3;
		x /= 9;

		cout << x << endl;

		cin >> n;
		cnt++;
	}

	return 0;
}

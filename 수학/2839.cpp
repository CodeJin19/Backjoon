#include <iostream>

using namespace std;

int main()
{
	int n, r, x;

	cin >> n;

	if (n <= 10)
	{
		switch (n)
		{
		case 7:
		case 4:
			cout << "-1\n";
			break;
		case 3:
		case 5:
			cout << "1\n";
			break;
		case 6:
		case 8:
		case 10:
			cout << "2\n";
			break;
		case 9:
			cout << "3\n";
			break;
		}
	}
	else
	{
		r = n % 5;
		x = n / 5;

		switch (r)
		{
		case 0:
			break;
		case 1:
			x++;
			break;
		case 2:
			x += 2;
			break;
		case 3:
			x++;
			break;
		case 4:
			x += 2;
			break;
		}

		cout << x << endl;
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int t, a, b;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> a >> b;

		switch (a % 10)
		{
		case 0:
			cout << "10\n";
			break;
		case 1:
			cout << "1\n";
			break;
		case 2:
			switch (b % 4)
			{
			case 0:
				cout << "6\n";
				break;
			case 1:
				cout << "2\n";
				break;
			case 2:
				cout << "4\n";
				break;
			case 3:
				cout << "8\n";
				break;
			}
			break;
		case 3:
			switch (b % 4)
			{
			case 0:
				cout << "1\n";
				break;
			case 1:
				cout << "3\n";
				break;
			case 2:
				cout << "9\n";
				break;
			case 3:
				cout << "7\n";
				break;
			}
			break;
		case 4:
			if (b % 2 == 0)
			{
				cout << "6\n";
			}
			else
			{
				cout << "4\n";
			}
			break;
		case 5:
			cout << "5\n";
			break;
		case 6:
			cout << "6\n";
			break;
		case 7:
			switch (b % 4)
			{
			case 0:
				cout << "1\n";
				break;
			case 1:
				cout << "7\n";
				break;
			case 2:
				cout << "9\n";
				break;
			case 3:
				cout << "3\n";
				break;
			}
			break;
		case 8:
			switch (b % 4)
			{
			case 0:
				cout << "6\n";
				break;
			case 1:
				cout << "8\n";
				break;
			case 2:
				cout << "4\n";
				break;
			case 3:
				cout << "2\n";
				break;
			}
			break;
		case 9:
			if (b % 2 == 0)
			{
				cout << "1\n";
			}
			else
			{
				cout << "9\n";
			}
			break;
		}
	}
	return 0;
}

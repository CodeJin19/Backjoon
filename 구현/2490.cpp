#include <iostream>

using namespace std;

int main()
{
	int sum, x;

	for (int itr = 0; itr < 3; itr++)
	{
		sum = 0;

		for (int i = 0; i < 4; i++)
		{
			cin >> x;
			sum += x;
		}

		switch (sum)
		{
		case 0:
			cout << "D\n";
			break;
		case 1:
			cout << "C\n";
			break;
		case 2:
			cout << "B\n";
			break;
		case 3:
			cout << "A\n";
			break;
		case 4:
			cout << "E\n";
			break;
		}
	}
	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int t, n;
	
	cin >> t;
	
	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		switch (n)
		{
		case 1:
			cout << "Pairs for 1:\n";
			break;
		case 2:
			cout << "Pairs for 2:\n";
			break;
		case 3:
			cout << "Pairs for 3: 1 2\n";
			break;
		case 4:
			cout << "Pairs for 4: 1 3\n";
			break;
		case 5:
			cout << "Pairs for 5: 1 4, 2 3\n";
			break;
		case 6:
			cout << "Pairs for 6: 1 5, 2 4\n";
			break;
		case 7:
			cout << "Pairs for 7: 1 6, 2 5, 3 4\n";
			break;
		case 8:
			cout << "Pairs for 8: 1 7, 2 6, 3 5\n";
			break;
		case 9:
			cout << "Pairs for 9: 1 8, 2 7, 3 6, 4 5\n";
			break;
		case 10:
			cout << "Pairs for 10: 1 9, 2 8, 3 7, 4 6\n";
			break;
		case 11:
			cout << "Pairs for 11: 1 10, 2 9, 3 8, 4 7, 5 6\n";
			break;
		case 12:
			cout << "Pairs for 12: 1 11, 2 10, 3 9, 4 8, 5 7\n";
			break;
		}
	}

	return 0;
}

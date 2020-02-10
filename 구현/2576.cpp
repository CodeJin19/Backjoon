#include <iostream>

using namespace std;

int main()
{
	int sum = 0, min = 2100000000, x;

	for (int i = 0; i < 7; i++)
	{
		cin >> x;

		if (x % 2 != 0)
		{
			sum += x;

			if (x < min)
			{
				min = x;
			}
		}
	}

	if (sum == 0)
	{
		cout << "-1\n";
	}
	else
	{
		cout << sum << endl << min << endl;
	}
    
	return 0;
}

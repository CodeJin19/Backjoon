#include <iostream>

using namespace std;

int main()
{
	int current = 0;
	int on, off;
	int max = 0;

	for (int i = 0; i < 4; i++)
	{
		cin >> off >> on;
		
		current -= off;
		current += on;

		if (max < current)
		{
			max = current;
		}
	}

	cout << max << endl;

	return 0;
}

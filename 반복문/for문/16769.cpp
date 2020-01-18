#include <iostream>

using namespace std;

int main()
{
	int bucket[3];
	int amount[3];

	for (int i = 0; i < 3; i++)
	{
		cin >> bucket[i] >> amount[i];
	}

	for (int i = 0; i < 100; i++)
	{
		switch (i % 3)
		{
		case 0:
			if (bucket[1] < amount[0] + amount[1])
			{
				amount[0] = amount[0] + amount[1] - bucket[1];
				amount[1] = bucket[1];
			}
			else
			{
				amount[1] += amount[0];
				amount[0] = 0;
			}
			break;
		case 1:
			if (bucket[2] < amount[1] + amount[2])
			{
				amount[1] = amount[1] + amount[2] - bucket[2];
				amount[2] = bucket[2];
			}
			else
			{
				amount[2] += amount[1];
				amount[1] = 0;
			}
			break;
		case 2:
			if (bucket[0] < amount[2] + amount[0])
			{
				amount[2] = amount[2] + amount[0] - bucket[0];
				amount[0] = bucket[0];
			}
			else
			{
				amount[0] += amount[2];
				amount[2] = 0;
			}
			break;
		}
	}

	for (int i = 0; i < 3; i++)
	{
		cout << amount[i] << endl;
	}
  
	return 0;
}

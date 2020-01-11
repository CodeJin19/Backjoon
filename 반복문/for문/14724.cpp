#include <iostream>

using namespace std;

int main()
{
	int n, x, max, mdx, ans = 0;
	
	cin >> n;

	for (int i = 0; i < 9; i++)
	{
		max = 0;

		for (int j = 0; j < n; j++)
		{
			cin >> x;

			if (max < x)
			{
				max = x;
			}
		}

		if (ans < max)
		{
			ans = max;
			mdx = i;
		}
	}

	switch (mdx)
	{
	case 0:
		cout << "PROBRAIN\n";
		break;
	case 1:
		cout << "GROW\n";
		break;
	case 2:
		cout << "ARGOS\n";
		break;
	case 3:
		cout << "ADMIN\n";
		break;
	case 4:
		cout << "ANT\n";
		break;
	case 5:
		cout << "MOTION\n";
		break;
	case 6:
		cout << "SPG\n";
		break;
	case 7:
		cout << "COMON\n";
		break;
	case 8:
		cout << "ALMIGHTY\n";
		break;
	}

	return 0;
}

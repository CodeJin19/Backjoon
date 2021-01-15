#include <iostream>

using namespace std;

int main()
{
	int num, sum, x;

	cin >> num;

	while (num != 0)
	{
		if (10 <= num)
		{
			sum = 0;

			while (num != 0)
			{
				x = num % 10;
				num /= 10;
				sum += x;
			}

			while (10 <= sum)
			{
				num = sum;
				sum = 0;

				while (num != 0)
				{
					x = num % 10;
					num /= 10;
					sum += x;
				}
			}
		}
		else
		{
			sum = num;
		}

		cout << sum << "\n";

		cin >> num;
	}

	return 0;
}

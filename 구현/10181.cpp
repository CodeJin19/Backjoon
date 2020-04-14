#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> divisor;
	int num, sum;

	cin >> num;

	while (num != -1)
	{
		divisor.clear();
		sum = 0;

		for (int i = 1; i < num; i++)
		{
			if (num % i == 0)
			{
				divisor.push_back(i);
				sum += i;
			}
		}

		if (sum == num)
		{
			cout << num << " = 1";

			for (int i = 1; i < divisor.size(); i++)
			{
				cout << " + " << divisor[i];
			}

			cout << "\n";
		}
		else
		{
			cout << num << " is NOT perfect.\n";
		}


		cin >> num;
	}

	return 0;
}

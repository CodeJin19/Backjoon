#include <iostream>
#include <vector>

using namespace std;

vector <int> arr;

int main()
{
	int t, x, min, sum;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		arr.clear();
		min = 2100000000;
		sum = 0;

		for (int i = 0; i < 7; i++)
		{
			cin >> x;
			arr.push_back(x);

			if (x % 2 == 0)
			{
				sum += x;

				if (x < min)
				{
					min = x;
				}
			}
		}

		cout << sum << " " << min << endl;
	}

	return 0;
}

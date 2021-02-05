#include <iostream>
#include <string>

using namespace std;

int main()
{
	int t, sum;
	string a, b;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> a >> b;

		sum = 0;

		for (int i = 0; i < a.length(); i++)
		{
			if (a[i] != b[i])
			{
				sum++;
			}
		}

		cout << "Hamming distance is " << sum <<".\n";
	}

	return 0;
}

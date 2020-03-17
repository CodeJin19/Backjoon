#include <iostream>
#include <string>

using namespace std;

int main()
{
	int t, x;
	string arr, brr;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> arr >> brr;

		cout << "Distances:";

		for (int i = 0; i < arr.length(); i++)
		{
			x = brr[i] - arr[i];

			if (x < 0)
				x += 26;

			cout << " " << x;
		}

		cout << "\n";
	}

	return 0;
}

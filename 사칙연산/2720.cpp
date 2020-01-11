#include <iostream>

using namespace std;

int main()
{
	int t, x;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> x;

		cout << x / 25 << " ";

		x %= 25;

		cout << x / 10 << " ";

		x %= 10;

		cout << x / 5 << " ";

		x %= 5;

		cout << x << "\n";
    }

	return 0;
}

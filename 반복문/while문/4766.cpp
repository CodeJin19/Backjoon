#include <iostream>

using namespace std;

int main()
{
	double before, now, diff;

	cin >> before >> now;

	while (now != 999)
	{
		diff = now - before;
		
		cout << fixed;
		cout.precision(2);
		cout << diff << "\n";

		before = now;

		cin >> now;
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int t, c, b;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> c >> b;

		cout << "You get " << c / b << " piece(s) and your dad gets " << c % b << " piece(s).\n";
	}

	return 0;
}

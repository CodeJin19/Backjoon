#include <iostream>

using namespace std;

int main()
{
	int n, r;

	cin >> n;

	r = (n + 8) % 12;

	cout << (char) ('A' + r);

	r = (n + 6) % 10;

	cout << r << "\n";

	return 0;
}

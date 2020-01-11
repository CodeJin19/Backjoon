#include <iostream>

using namespace std;

int main()
{
	int t, v, e;

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		cin >> v >> e;
		cout << 2 + e - v << "\n";
	}

	return 0;
}

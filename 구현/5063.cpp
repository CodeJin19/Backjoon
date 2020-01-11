#include <iostream>

using namespace std;

int main()
{
	int r, c, e, t;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> r >> e >> c;

		if (r == e - c)
		{
			cout << "does not matter\n";
		}
		else if (r < e - c)
		{
			cout << "advertise\n";
		}
		else
		{
			cout << "do not advertise\n";
		}
	}
	return 0;
}

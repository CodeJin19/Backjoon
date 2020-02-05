#include <iostream>

using namespace std;

int main()
{
	int x, y;

	cin >> x >> y;

	while (x != 0 || y != 0)
	{
		if (y < x)
		{
			cout << "Yes\n";
		}
		else
		{
			cout << "No\n";
		}

		cin >> x >> y;
	}

	return 0;
}

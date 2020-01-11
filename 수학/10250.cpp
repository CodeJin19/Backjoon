#include <iostream>

using namespace std;

int main()
{
	int T, h, w, n, floor, room;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> h >> w >> n;

		room = n / h;

		if (n % h != 0)
		{
			room++;
		}

		floor = n % h;

		if (floor == 0)
		{
			floor = h;
		}

		cout << floor;

		if (room < 10)
		{
			cout << "0";
		}

		cout << room << "\n";
	}

	return 0;
}

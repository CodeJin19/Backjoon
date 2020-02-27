#include <iostream>

using namespace std;

bool isFight(int x, int y)
{
	if (x < y)
	{
		if (y - x == 1 && x % 2 == 1)
			return true;
		else
			return false;
	}
	else
	{
		if (x - y == 1 && y % 2 == 1)
			return true;
		else
			return false;
	}

	return false;
}

int main()
{
    int n, x, y, cnt = 1;

    cin >> n >> x >> y;

	while (!isFight(x, y))
	{
		if (x % 2 == 1)
			x++;
        
		x /= 2;
        
		if (y % 2 == 1)
			y++;
        
		y /= 2;
        
		cnt++;
	}

	cout << cnt << endl;

	return 0;
}

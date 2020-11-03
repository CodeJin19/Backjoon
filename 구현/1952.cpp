#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <bool>> fld;
	vector <bool> tmp;
	int h, w, dir, y, x, cnt, val, limit;

	cin >> h >> w;

	for (int i = 0; i < w; ++i)
	{
		tmp.push_back(false);
	}

	for (int i = 0; i < h; ++i)
	{
		fld.push_back(tmp);
	}

	y = 0;
	x = 0;
	dir = 1;
	cnt = 0;
	val = 0;
	limit = w * h;

	while (val < limit)
	{
		if (!fld[y][x])
		{
			fld[y][x] = true;
			val++;
		}

		switch (dir)
		{
		case 1:
			x++;
			if (w <= x || fld[y][x])
			{
				x--;
				cnt++;
				dir = 4;
			}
			break;
		case 2:
			y--;
			if (y < 0 || fld[y][x])
			{
				y++;
				cnt++;
				dir = 1;
			}
			break;
		case 3:
			x--;
			if (x < 0 || fld[y][x])
			{
				x++;
				cnt++;
				dir = 2;
			}
			break;
		case 4:
			y++;
			if (h <= y || fld[y][x])
			{
				y--;
				cnt++;
				dir = 3;
			}
			break;
		}
	}

	cnt--;

	cout << cnt << endl;

	return 0;
}

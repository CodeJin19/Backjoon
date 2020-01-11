#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int T, x1, y1, r1, x2, y2, r2, dx, dy;
	double len;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;

		if (x1 == x2 && y1 == y2)  //동심원의 경우
		{
			if (r1 == r2)
			{
				cout << "-1\n";
			}
			else
			{
				cout << "0\n";
			}
		}
		else
		{
			dx = abs(x1 - x2);  //두 점의 x좌표 거리
			dy = abs(y1 - y2);  //두 점의 y좌표 거리
			len = sqrt(dx * dx + dy * dy);  //두 원의 중심 사이의 거리

			if (len == r1 + r2)  //외접하는 경우
			{
				cout << "1\n";
			}
			else if(r1 + r2 < len)  //두 원이 만나지 않는 경우
			{
				cout << "0\n";
			}
			else
			{
				if (len + r2 < r1 || len + r1 < r2)  //큰 원이 작은 원을 포함해서 접점이 생기지 않는 경우
				{
					cout << "0\n";
				}
				else if (len + r2 == r1 | len + r1 == r2)  //내접하는 경우
				{
					cout << "1\n";
				}
				else  //그 외 = 두 점에서 만나는 경우
				{
					cout << "2\n";
				}
			}
		}
	}

	return 0;
}

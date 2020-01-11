#include <iostream>

using namespace std;

int main()
{
	int x, y, w, h;
	int min;

	cin >> x >> y >> w >> h;

	if (x < y)  //현위치에서 x축과 y축까지의 거리 중 더 적은 걸 min에 저장
	{
		min = x;
	}
	else
	{
		min = y;
	}

	if (w - x < min)  //min과 현위치에서 오른쪽 변까지의 거리 비교
	{
		min = w - x;
	}

	if (h - y < min)  //min과 현위치에서 위쪽 변까지의 거리 비교
	{
		min = h - y;
	}

	cout << min << endl;

	return 0;
}

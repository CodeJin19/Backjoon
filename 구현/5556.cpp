#include <iostream>

using namespace std;

int l;

void swap(int * x, int * y)  //(x,y) 좌표가 2사분면을 넘어가면 2사분면의 좌표로 대칭변환는 함수
{
	if (l % 2 == 0)
	{
		if (l / 2 < *x)
		{
			*x = l + 1 - *x;
		}

		if (l / 2 < * y)
		{
			*y = l + 1 - *y;
		}
	}
	else
	{
		l++;

		if (l / 2 < *x)
		{
			*x = l - *x;
		}

		if (l / 2 < *y)
		{
			*y = l - *y;
		}

		l--;
	}
}

int main()
{
	int n, x, y;

	cin >> l >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;
		swap(&x, &y);

		if (x < y)
		{
			switch (x % 3)
			{
			case 0:
				cout << "3\n";
				break;
			case 1:
				cout << "1\n";
				break;
			case 2:
				cout << "2\n";
				break;
			}
		}
		else
		{
			switch (y % 3)
			{
			case 0:
				cout << "3\n";
				break;
			case 1:
				cout << "1\n";
				break;
			case 2:
				cout << "2\n";
				break;
			}
		}
	}

	return 0;
}

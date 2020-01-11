#include <iostream>

using namespace std;

char fld[2200][2200];

void erase(int sx, int sy, int ex, int ey, int len)
{
	int d = len / 3;
	int msx = sx + d;
	int mex = msx + d;
	int msy = sy + d;
	int mey = msy + d;

	for (int i = msy; i < mey; i++)  //입력받은 범위의 가운데 ' '로 치환
	{
		for (int j = msx; j < mex; j++)
		{
			fld[j][i] = ' ';
		}
	}

	if (len != 3)  //입력받은 범위를 9등분하고 그 중 8부분을 재귀 
	{
		len /= 3;

		erase(sx, sy, sx + len - 1, sy + len - 1, len);
		erase(sx + len, sy, sx + len + len - 1, sy + len - 1, len);
		erase(sx + len + len, sy, ex, sy + len - 1, len);
		erase(sx, sy + len, sx + len - 1, sy + len + len - 1, len);
		erase(sx + len + len, sy + len, ex, sy + len + len - 1, len);
		erase(sx, sy + len + len, sx + len - 1, ey, len);
		erase(sx + len, sy + len + len, sx + len + len - 1, ey, len);
		erase(sx + len + len, sy + len + len, ex, ey, len);
	}
}

int main()
{
	int num;

	cin >> num;

	for (int i = 1; i <= num; i++)  //fld 넓이만큼 *을 채운다
	{
		for (int j = 1; j <= num; j++)
		{
			fld[i][j] = '*';
		}
	}

	erase(1, 1, num, num, num);  //필요한 부분 ' '으로 치환

	for (int i = 1; i <= num; i++)  //출력
	{
		for (int j = 1; j <= num; j++)
		{
			cout << fld[i][j];
		}

		cout << "\n";
	}

	cin >> num;

	return 0;
}

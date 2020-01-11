#include <iostream>

using namespace std;

int main()
{
	int h, w, x;
	char fld[110][110];
	int ans[100][100];

	cin >> h >> w;

	for (int i = 0; i < h; i++)
	{
		cin >> fld[i];
	}

	for (int i = 0; i < h; i++)  //각 행에서 좌에서 우로 가면서 ans 배열에 입력
	{
		x = -1;

		for (int j = 0; j < w; j++)
		{
			if (x == -1)  //여태 구름이 없었고,
			{
 				if (fld[i][j] == '.')  //지금도 구름이 없다면 -1
				{
					ans[i][j] = x;
				}
				else  //지금 구름이 있으면 0
				{
					x = 0;
					ans[i][j] = x;
				}
			}
			else  //구름이 적어도 한 번 있었고,
			{
				if (fld[i][j] == '.')  //지금 구름이 없다면 구름이 도착하는 시간 입력
				{
					x++;
					ans[i][j] = x;
				}
				else  //지금 구름이 있다면 0
				{
					x = 0;
					ans[i][j] = x;
				}
			}
		}
	}

	for (int i = 0; i < h; i++)
	{
		for (int j = 0;j < w; j++)
		{
			cout << ans[i][j] << " ";
		}
		cout << endl;
	}

	return 0;
}

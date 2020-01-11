#include <iostream>

using namespace std;

int main()
{
	int r, c, cnt, bot, top, left, right;
	char fld[15][15];
	char ans[15][15];

	cin >> r >> c;

	//입력
	for (int i = 1; i <= r; i++)
	{
		for (int j = 1; j <= c; j++)
		{
			cin >> fld[i][j];
		}
	}
	
	//테두리에 바다 추가
	for (int i = 0; i <= c + 1; i++)
	{
		fld[0][i] = '.';
		fld[r + 1][i] = '.';
	}

	for (int i = 0; i <= r + 1; i++)
	{
		fld[i][0] = '.';
		fld[i][c + 1] = '.';
	}

	for (int i = 1; i <= r; i++)
	{
		for (int j = 1; j <= c; j++)
		{
			if (fld[i][j] == '.')  //바다인 경우
			{
				ans[i][j] = '.';
			}
			else  //육지인 경우
			{
				
				//육지의 상하좌우 네 군데 확인
				cnt = 0;

				if (fld[i - 1][j] == '.')
				{
					cnt++;
				}
				if (fld[i + 1][j] == '.')
				{
					cnt++;
				}
				if (fld[i][j - 1] == '.')
				{
					cnt++;
				}
				if (fld[i][j + 1] == '.')
				{
					cnt++;
				}
				
				if (3 <= cnt)  //3군데 이상이 바다이면 바다로 변환
				{
					ans[i][j] = '.';
				}
				else
				{
					ans[i][j] = 'X';
				}
			}
		}
	}

	bot = r + 1;
	top = 0;
	left = c + 1;
	right = 0;

	for (int i = 1; i <= r; i++)
	{
		for (int j = 1; j <= c; j++)
		{
			if (ans[i][j] == 'X')
			{
				if (j < left)
				{
					left = j;
				}

				if (right < j)
				{
					right = j;
				}

				if (i < bot)
				{
					bot = i;
				}

				if (top < i)
				{
					top = i;
				}
			}
		}
	}

	for (int i = bot; i <= top; i++)
	{
		for (int j = left; j <= right; j++)
		{
			cout << ans[i][j];
		}
		cout << endl;
	}

	return 0;
}

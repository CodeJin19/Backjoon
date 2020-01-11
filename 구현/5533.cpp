#include <iostream>

using namespace std;

int main()
{
	int n;
	int score[210][4];
	bool flag;

	cin >> n;

	for (int i = 1; i <= n; i++)
	{
		score[i][0] = 0;
		cin >> score[i][1];
		cin >> score[i][2];
		cin >> score[i][3];
	}

	for (int j = 1; j <= 3; j++)
	{
		for (int i = 1; i <= n; i++)
		{
			if (score[i][j] != 0)
			{
				flag = false;

				for (int k = i + 1; k <= n; k++)
				{
					if (score[k][j] == score[i][j])
					{
						score[k][j] = 0;
						flag = true;
					}
				}

				if (flag)
				{
					score[i][j] = 0;
				}
			}
		}
	}

	for (int i = 1; i <= n; i++)
	{
		cout << score[i][1] + score[i][2] + score[i][3] << "\n";
	}

	return 0;
}

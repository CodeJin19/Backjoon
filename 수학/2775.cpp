#include <iostream>

using namespace std;

int main()
{
	int T, k, n;
	int fld[16][16];

	cin >> T;

	for (int i = 1; i < 16; i++)  //배열 
	{
		fld[0][i] = i;
		fld[i][1] = 1;
	}

	for (int i = 1; i < 16; i++)
	{
		for (int j = 2; j < 16; j++)
		{
			fld[i][j] = fld[i][j - 1] + fld[i - 1][j];
		}
	}

	for (int itr = 0; itr < T; itr++)  //입력 및 출력
	{
		cin >> k >> n;

		cout << fld[k][n] << "\n";
	}

	return 0;
}

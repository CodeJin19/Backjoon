#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
	int score[8];
	int idxarr[5];
	int max, idx;
	int sum = 0;
	int idxptr = 0;

	for (int i = 0; i < 8; i++)
	{
		cin >> score[i];
	}

	for (int i = 0; i < 5; i++)  //최댓값을 5번 찾고, 점수 합 계산
	{
		max = 0;

		for (int j = 0; j < 8; j++)
		{
			if (max < score[j])
			{
				max = score[j];
				idx = j;
			}
		}

		sum += max;
		score[idx] = 0;
		idxarr[idxptr] = idx + 1;
		idxptr++;
	}

	sort(idxarr, idxarr + idxptr);

	cout << sum << endl;

	for (int i = 0; i < idxptr; i++)
	{
		cout << idxarr[i] << " ";
	}
	cout << endl;

	return 0;
}

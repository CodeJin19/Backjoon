#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, flag, country, num, score, max = -1, idx;
	vector <vector <int>> fld;
	vector <int> tmp;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		cin >> country >> num >> score;

		tmp.push_back(country);
		tmp.push_back(num);
		tmp.push_back(score);
		fld.push_back(tmp);

		if (max < score)
		{
			max = score;
			idx = i;
		}
	}

  //1등 출력
	cout << fld[idx][0] << " " << fld[idx][1] << endl;
	flag = fld[idx][0];
	fld[idx][2] = -1;
	max = -1;

  //2등 검색 및 출력
	for (int i = 0; i < n; i++)
	{
		if (max < fld[i][2])
		{
			max = fld[i][2];
			idx = i;
		}
	}

	cout << fld[idx][0] << " " << fld[idx][1] << endl;
	fld[idx][2] = -1;
	max = -1;

	if (flag != fld[idx][0])
	{
		flag = 0;  //3등 소속국가 상관 없음
	}

	if (flag == 0)  //3등 소속국가 상관 없는 경우
	{
		for (int i = 0; i < n; i++)
		{
			if (max < fld[i][2])
			{
				max = fld[i][2];
				idx = i;
			}
		}
	}
	else  //3등 소속국가 상관 있는 경우
	{
		for (int i = 0; i < n; i++)
		{
			if (fld[i][0] != flag && max < fld[i][2])
			{
				max = fld[i][2];
				idx = i;
			}
		}
	}

	cout << fld[idx][0] << " " << fld[idx][1] << endl;

	return 0;
}

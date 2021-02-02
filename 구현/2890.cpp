#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <char>> fld;
	vector <char> tmp;
	vector <int> rank;
	vector <int> pos;
	int r, c, max, cnt, left, rankVal;
	char x;

	cin >> r >> c;

	for (int i = 0; i < r; i++)
	{
		tmp.clear();

		for(int j = 0; j < c; j++)
		{
			cin >> x;
			tmp.push_back(x);
		}

		fld.push_back(tmp);
	}

	for (int i = 0; i < 10; i++)
	{
		rank.push_back(0);
		pos.push_back(0);
	}

	for (int i = 0; i < r; i++)
	{
		for (int j = c - 1; 0 <= j; j--)
		{
			if ('1' <= fld[i][j] && fld[i][j] <= '9')
			{
				pos[(int)(fld[i][j] - '0')] = j;
				break;
			}
		}
	}

	left = 9;
	rankVal = 1;

	while (0 < left)
	{
		max = 0;
		cnt = 0;

		for (int i = 1; i < 10; i++)
			if (max < pos[i])
				max = pos[i];

		for (int i = 1; i < 10; i++)
		{
			if (pos[i] == max)
			{
				rank[i] = rankVal;
				pos[i] = -1;
				cnt++;
				left--;
			}
		}

		rankVal++;
	}

	for (int i = 1; i < 10; i++)
		cout << rank[i] << "\n";

	return 0;
}

#include <iostream>
#include <stdio.h>
#include <vector>
#include <string>
#include <math.h>
#include <algorithm>
#include <queue>

using namespace std;

vector <vector <char>> fld;
int cache[20];
int n, m;

int move(int dir, int* box, int* boy, int* bnx, int* bny, int* rox, int* roy, int* rnx, int* rny)
{
	bool redFlag, blueFlag;
	int d;

	switch (dir)
	{
	case 0: //우
		if (*box < *rox)
		{
			d = 1;

			while (fld[*roy][*rox + d] == '.')
			{
				d++;
			}

			*rny = *roy;
			*rnx = *rox + d;

			if (fld[*rny][*rnx] == '#')
			{
				*rnx -= 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				fld[*roy][*rox] = '.';
				redFlag = true;
			}

			d = 1;

			while (fld[*boy][*box + d] == '.')
			{
				d++;
			}

			*bny = *boy;
			*bnx = *box + d;

			if (fld[*bny][*bnx] == '#' || fld[*bny][*bnx] == 'R')
			{
				*bnx -= 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				blueFlag = true;
			}
		}
		else
		{
			d = 1;

			while (fld[*boy][*box + d] == '.')
			{
				d++;
			}

			*bny = *boy;
			*bnx = *box + d;

			if (fld[*bny][*bnx] == '#')
			{
				*bnx -= 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				fld[*boy][*box] = '.';
				blueFlag = true;
			}

			d = 1;

			while (fld[*roy][*rox + d] == '.')
			{
				d++;
			}

			*rny = *roy;
			*rnx = *rox + d;

			if (fld[*rny][*rnx] == '#' || fld[*rny][*rnx] == 'B')
			{
				*rnx -= 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				redFlag = true;
			}
		}
		break;
	case 1: //상
		if (*boy < *roy)
		{
			d = 1;

			while (fld[*boy - d][*box] == '.')
			{
				d++;
			}

			*bny = *boy - d;
			*bnx = *box;

			if (fld[*bny][*bnx] == '#')
			{
				*bny += 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				fld[*boy][*box] = '.';
				blueFlag = true;
			}

			d = 1;

			while (fld[*roy - d][*rox] == '.')
			{
				d++;
			}

			*rny = *roy - d;
			*rnx = *rox;

			if (fld[*rny][*rnx] == '#' || fld[*rny][*rnx] == 'B')
			{
				*rny += 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				cout << "----------CHECK!!!!!!!1-----------------\n";
				redFlag = true;
			}
		}
		else
		{
			d = 1;

			while (fld[*roy - d][*rox] == '.')
			{
				d++;
			}

			*rny = *roy - d;
			*rnx = *rox;

			if (fld[*rny][*rnx] == '#')
			{
				*rny += 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				fld[*roy][*rox] = '.';
				redFlag = true;
			}

			d = 1;

			while (fld[*boy - d][*box] == '.')
			{
				d++;
			}

			*bny = *boy - d;
			*bnx = *box;

			if (fld[*bny][*bnx] == '#' || fld[*bny][*bnx] == 'R')
			{
				*bny += 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				blueFlag = true;
			}
		}
		break;
	case 2: //좌
		if (*box < *rox)
		{
			d = 1;

			while (fld[*boy][*box - d] == '.')
			{
				d++;
			}

			*bny = *boy;
			*bnx = *box - d;

			if (fld[*bny][*bnx] == '#')
			{
				*bnx += 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				fld[*boy][*box] = '.';
				blueFlag = true;
			}

			d = 1;

			while (fld[*roy][*rox - d] == '.')
			{
				d++;
			}

			*rny = *roy;
			*rnx = *rox - d;

			if (fld[*rny][*rnx] == '#' || fld[*rny][*rnx] == 'B')
			{
				*rnx += 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				redFlag = true;
			}
		}
		else
		{
			d = 1;

			while (fld[*roy][*rox - d] == '.')
			{
				d++;
			}

			*rny = *roy;
			*rnx = *rox - d;

			if (fld[*rny][*rnx] == '#')
			{
				*rnx += 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				fld[*roy][*rox] = '.';
				redFlag = true;
			}

			d = 1;

			while (fld[*boy][*box - d] == '.')
			{
				d++;
			}

			*bny = *boy;
			*bnx = *box - d;

			if (fld[*bny][*bnx] == '#' || fld[*bny][*bnx] == 'R')
			{
				*bnx += 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				blueFlag = true;
			}
		}
		break;
	case 3: //하
		if (*boy < *roy)
		{
			d = 1;

			while (fld[*roy + d][*rox] == '.')
			{
				d++;
			}

			*rny = *roy + d;
			*rnx = *rox;

			if (fld[*rny][*rnx] == '#')
			{
				*rny -= 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				fld[*roy][*rox] = '.';
				redFlag = true;
			}

			d = 1;

			while (fld[*boy + d][*box] == '.')
			{
				d++;
			}

			*bny = *boy + d;
			*bnx = *box;

			if (fld[*bny][*bnx] == '#' || fld[*bny][*bnx] == 'R')
			{
				*bny -= 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				blueFlag = true;
			}
		}
		else
		{
			d = 1;

			while (fld[*boy + d][*box] == '.')
			{
				d++;
			}

			*bny = *boy + d;
			*bnx = *box;

			if (fld[*bny][*bnx] == '#')
			{
				*bny -= 1;
				fld[*boy][*box] = '.';
				fld[*bny][*bnx] = 'B';
				blueFlag = false;
			}
			else if (fld[*bny][*bnx] == 'O')
			{
				fld[*boy][*box] = '.';
				blueFlag = true;
			}

			d = 1;

			while (fld[*roy + d][*rox] == '.')
			{
				d++;
			}

			*rny = *roy + d;
			*rnx = *rox;

			if (fld[*rny][*rnx] == '#' || fld[*rny][*rnx] == 'B')
			{
				*rny -= 1;
				fld[*roy][*rox] = '.';
				fld[*rny][*rnx] = 'R';
				redFlag = false;
			}
			else if (fld[*rny][*rnx] == 'O')
			{
				redFlag = true;
			}
		}
		break;
	}

	if (blueFlag)
	{
		return -1;
	}
	else if (redFlag)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

bool solve(int cnt, int box, int boy, int rox, int roy)
{
	int bnx, bny, rnx, rny, result, x;

	if (cnt == 11)
	{
		cout << "out of cnt\n";
		for (int a = 1; a < cnt; a++)
		{
			cout << cache[a];
		}
		cout << endl;

		return false;
	}
	/*
	for (int i = 0; i < fld.size(); i++)
	{
		for (int j = 0; j < fld[i].size(); j++)
		{
			cout << fld[i][j] << " ";
		}
		cout << "\n";
	}
	cin >> x;
	*/

	for (int i = 0; i < 4; i++)
	{
		result = move(i, &box, &boy, &bnx, &bny, &rox, &roy, &rnx, &rny);
		cache[cnt] = i;

		if (boy != bny || box != bnx || roy != rny || rox != rnx)
		{
			switch (result)
			{
			case -1:
				break;
			case 0:
				if (solve(cnt + 1, bnx, bny, rnx, rny))
				{
					for (int a = 1; a <= cnt; a++)
					{
						cout << cache[a];
					}
					cout << endl;
					cout << "case 0 : true\n";
					return true;
				}
				break;
			case 1:
				for (int a = 1; a <= cnt; a++)
				{
					cout << cache[a];
				}
				cout << endl;
				cout << "true\n";
				return true;
				break;
			}
			fld[bny][bnx] = '.';
			fld[boy][box] = 'B';
			fld[rny][rnx] = '.';
			fld[roy][rox] = 'R';
		}
	}

	cout << "end of solve\n";
	for (int a = 1; a <= cnt; a++)
	{
		cout << cache[a];
	}
	cout << endl;
	return false;
}

int main()
{
	vector <char> tmp;
	char x;
	int bx, by, rx, ry;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < m; j++)
		{
			cin >> x;

			tmp.push_back(x);
		}

		fld.push_back(tmp);
	}

	for (int i = 0; i < fld.size(); i++)
	{
		for (int j = 0; j < fld[i].size(); j++)
		{
			if (fld[i][j] == 'R')
			{
				rx = j;
				ry = i;
			}
			else if (fld[i][j] == 'B')
			{
				bx = j;
				by = i;
			}
		}
	}

	if (solve(1, bx, by, rx, ry))
	{
		cout << "1\n";
	}
	else
	{
		cout << "0\n";
	}

	return 0;
}

#include <iostream>
#include <vector>
#include <math.h>

using namespace std;

int main()
{
	vector < vector <int>> fld;
	vector <int> tmp;
	int n, m, z, x1, y1, x2, y2, d;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < m; j++)
		{
			cin >> z;

			tmp.push_back(z);
		}

		fld.push_back(tmp);
	}
	
	x1 = -1;
	y1 = -1;
	x2 = -1;
	y2 = -1;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			if (fld[i][j] == 1)
			{
				if (x1 == -1)
				{
					x1 = j;
					y1 = i;
				}
				else
				{
					x2 = j;
					y2 = i;
				}
			}
		}
	}

	d = abs(x1 - x2);
	d += abs(y1 - y2);

	cout << d << endl;
    
	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <vector <bool>> fld;
	vector <bool> tmp;
	int n, c, r, len, idx;
	char x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		for (int j = 0; j < n; j++)
		{
			cin >> x;

			if (x == '.')
			{
				tmp.push_back(true);
			}
			else
			{
				tmp.push_back(false);
			}
		}

		fld.push_back(tmp);
	}

	c = 0;

	for (int i = 0; i < n; i++)
	{
		len = 0;
		idx = 0;

		while (idx < n)
		{
			while (idx < n && fld[i][idx])
			{
				len++;
				idx++;
			}

			if (2 <= len)
			{
				c++;
			}

			len = 0;
			idx++;
		}
		
	}

	r = 0;

	for (int i = 0; i < n; i++)
	{
		len = 0;
		idx = 0;

		while (idx < n)
		{
			while (idx < n && fld[idx][i])
			{
				len++;
				idx++;
			}

			if (2 <= len)
			{
				r++;
			}

			len = 0;
			idx++;
		}
	}

	cout << c << " " << r << endl;

	return 0;
}

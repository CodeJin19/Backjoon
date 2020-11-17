#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main()
{	
	vector <vector <string>> list;
	vector <string> tmp;
	string s;
	int n, l, limit, max = 0;
	bool flag;

	cin >> n;

	for (int i = 0; i < n; ++i)
	{
		cin >> s;

		l = s.length();

		if (max <= l)
		{
			tmp.clear();

			for (; max <= l; ++max)
			{
				list.push_back(tmp);
			}
		}

		limit = list[l].size();
		flag = true;

		for (int j = 0; j < limit; ++j)
		{
			if (list[l][j].compare(s) == 0)
			{
				flag = false;
				break;
			}
		}

		if (flag)
		{
			list[l].push_back(s);
		}
	}

	for (int i = 0; i < max; ++i)
	{
		sort(list[i].begin(), list[i].end());

		l = list[i].size();
		
		for (int j = 0; j < l; ++j)
		{
			cout << list[i][j] << endl;
		}
	}

	return 0;
}

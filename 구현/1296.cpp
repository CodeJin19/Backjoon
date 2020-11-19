#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	vector <string> list;
	vector <int> l;
	vector <int> o;
	vector <int> v;
	vector <int> e;
	string name1, name2, ans;
	int n, len, tmp, max;

	cin >> name1 >> n;

	len = name1.length();

	l.push_back(0);
	l.push_back(0);
	o.push_back(0);
	o.push_back(0);
	v.push_back(0);
	v.push_back(0);
	e.push_back(0);
	e.push_back(0);

	for (int i = 0; i < len; ++i)
	{
		if (name1[i] == 'L')
		{
			l[0] += 1;
		}
		else if (name1[i] == 'O')
		{
			o[0] += 1;
		}
		else if(name1[i] == 'V')
		{
			v[0] += 1;
		}
		else if(name1[i] == 'E')
		{
			e[0] += 1;
		}
	}

	max = -1;

	for (int i = 0; i < n; ++i)
	{
		cin >> name2;
		list.push_back(name2);
	}

	sort(list.begin(), list.end());

	for (int i = 0; i < n; ++i)
	{
		name2 = list[i];

		len = name2.length();

		l[1] = 0;
		o[1] = 0;
		v[1] = 0;
		e[1] = 0;

		for (int j = 0; j < len; ++j)
		{
			if (name2[j] == 'L')
			{
				l[1] += 1;
			}
			else if (name2[j] == 'O')
			{
				o[1] += 1;
			}
			else if(name2[j] == 'V')
			{
				v[1] += 1;
			}
			else if(name2[j] == 'E')
			{
				e[1] += 1;
			}
		}

		tmp = (l[0] + l[1] + o[0] + o[1]) * (l[0] + l[1] + v[0] + v[1]) * (l[0] + l[1] + e[0] + e[1]) * (o[0] + o[1] + v[0] + v[1]) * (o[0] + o[1] + e[0] + e[1]) * (v[0] + v[1] + e[0] + e[1]);
		tmp %= 100;

		if (max < tmp)
		{
			max = tmp;
			ans = name2;
		}
	}

	cout << ans << endl;

	return 0;
}

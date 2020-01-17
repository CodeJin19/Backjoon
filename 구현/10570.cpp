#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> num;
	vector <int> cnt;
	int n, v, s, max, min;
	bool flag;

	cin >> n;

	for (int itr = 0; itr < n; itr++)
	{
		cin >> v;

		num.clear();
		cnt.clear();
		max = 1;
		min = 10000;

		for (int i = 0; i < v; i++)
		{
			cin >> s;
			flag = true;

			for (int j = 0; j < num.size(); j++)
			{
				if (s == num[j])
				{
					cnt[j] ++;
					flag = false;

					if (max < cnt[j])
					{
						max = cnt[j];
					}
				}
			}

			if (flag)
			{
				num.push_back(s);
				cnt.push_back(1);
			}
		}

		for (int i = 0; i < num.size(); i++)
		{
			if (max == cnt[i] && num[i] < min)
			{
				min = num[i];
			}
		}

		cout << min << endl;
	}

	return 0;
}

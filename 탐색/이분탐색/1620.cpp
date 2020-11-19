#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <utility>

using namespace std;

int main()
{
	vector <pair <string, int>> listStr;
	vector <string> listNum;
	string s;
	int n, t, num, len, from, to, mid, tmp;
    
    ios::ios_base::sync_with_stdio(false);
    cin.tie(NULL); 
    
	cin >> n >> t;

	num = 0;

	for (int i = 0; i < n; i++)
	{
		num++;
		cin >> s;
		listStr.push_back(make_pair(s, num));
		listNum.push_back(s);
	}

	sort(listStr.begin(), listStr.end());

	for (int itr = 0; itr < t; itr++)
	{
		cin >> s;

		if ('0' <= s[0] && s[0] <= '9')
		{
			len = s.length();
			num = 0;

			for (int i = 0; i < len; i++)
			{
				num *= 10;
				num += (int)(s[i] - '0');
			}

			cout << listNum[num - 1] << "\n";
		}
		else
		{
			from = 0;
			to = n;

			while (1)
			{
				mid = from + to;
				mid /= 2;
				tmp = listStr[mid].first.compare(s);

				if (tmp == 0)
				{
					cout << listStr[mid].second << "\n";
					break;
				}
				else if (tmp < 0)
				{
					from = mid;
				}
				else
				{
					to = mid;
				}
			}
		}
	}

	return 0;
}

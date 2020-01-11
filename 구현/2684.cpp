#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int t;
	char a, b, c;
	string s;
	vector <int> cnt;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cnt.clear();
		for (int i = 0; i < 8; i++)
		{
			cnt.push_back(0);
		}
		
		cin >> s;

		a = s[0];
		b = s[1];

		for (int i = 2; i < 40; i++)
		{
			c = s[i];

			if (a == 'H')
			{
				if (b == 'H')
				{
					if (c == 'H')
					{
						cnt[7] += 1;
					}
					else
					{
						cnt[6] += 1;
					}
				}
				else
				{
					if (c == 'H')
					{
						cnt[5] += 1;
					}
					else
					{
						cnt[4] += 1;
					}
				}
			}
			else
			{
				if (b == 'H')
				{
					if (c == 'H')
					{
						cnt[3] += 1;
					}
					else
					{
						cnt[2] += 1;
					}
				}
				else
				{
					if (c == 'H')
					{
						cnt[1] += 1;
					}
					else
					{
						cnt[0] += 1;
					}
				}
			}

			a = b;
			b = c;
		}

		for (int i = 0; i < 8; i++)
		{
			cout << cnt[i] << " ";
		}
		cout << endl;
	}

	return 0;
}

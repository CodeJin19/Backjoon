#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector <bool> flag;
	string s;
	int t, l, idx, sum;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		sum = 0;
		flag.clear();

		for (int i = 0; i < 26; i++)
		{
			flag.push_back(true);
		}

		cin >> s;

		l = s.length();

		for (int i = 0; i < l; i++)
		{
			idx = s[i] - 'A';

			if (flag[idx])
				flag[idx] = false;
		}

		for (int i = 0; i < 26; i++)
			if (flag[i])
				sum += (65 + i);

		cout << sum << "\n";
	}

	return 0;
}

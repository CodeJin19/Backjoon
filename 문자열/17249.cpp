#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;

	int l = 0, r = 0, idx = 0;

	cin >> s;

	while (s[idx] != '(')
	{
		if (s[idx] == '@')
		{
			l++;
		}

		idx++;
	}

	while (idx < s.length())
	{
		if (s[idx] == '@')
		{
			r++;
		}

		idx++;
	}

	cout << l << " " << r << endl;

	return 0;
}

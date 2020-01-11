#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n, l, idx = 0;
	string s;
	bool flag = true;

	cin >> n >> s;

	l = s.length();

	while (idx < l - 1)
	{
		if (s[idx] == s[idx + 1])
		{
			flag = false;
			break;
		}
		idx++;
	}

	if (flag)
	{
		cout << "Yes\n";
	}
	else
	{
		cout << "No\n";
	}

	return 0;
}

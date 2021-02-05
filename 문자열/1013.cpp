#include <iostream>
#include <string>

using namespace std;

string str;
int len;

bool solve(int idx)
{
	if (len <= idx)
		return true;

	bool ret = false;

	if (str[idx] == '1') // 100+1+
	{
		if (len <= idx + 3 || str[idx + 1] != '0' || str[idx + 2] != '0')
			return false;

		idx++;

		while (idx < len && str[idx] == '0')
			idx++;

		if (idx == len)
			return false;

		while (!ret && idx < len && str[idx] == '1')
		{
			ret = ret | solve(idx + 1);
			idx++;
		}

		return ret;
	}
	else // 01
	{
		if (idx + 1 == len)
			return false;
		else if (str[idx + 1] == '0')
			return false;
		else
			ret = ret | solve(idx + 2);
	}

	return ret;
}

int main()
{
	int T;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> str;

		len = str.length();

		if (solve(0))
			cout << "YES\n";
		else
			cout << "NO\n";
	}
	return 0;
}

#include <iostream>
#include <string>

using namespace std;

string toBin(string s)
{
	int len = s.length();
	string ans = "";

	if (s.compare("0") == 0)
	{
		return "0";
	}

	for (int i = 0; i < len; ++i)
	{
		switch (s[i])
		{
		case '0':
			ans += "000";
			break;
		case '1':
			ans += "001";
			break;
		case '2':
			ans += "010";
			break;
		case '3':
			ans += "011";
			break;
		case '4':
			ans += "100";
			break;
		case '5':
			ans += "101";
			break;
		case '6':
			ans += "110";
			break;
		case '7':
			ans += "111";
			break;
		}
	}

	for (int i = 0; i < len * 3; ++i)
	{
		if (ans[i] != '0')
		{
			ans = ans.substr(i, len * 3);
			break;
		}
	}

	return ans;
}

int main()
{
	string s;

	cin >> s;

	cout << toBin(s) << endl;
	
	return 0; 
}

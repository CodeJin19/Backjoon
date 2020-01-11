#include <string>
#include <iostream>

using namespace std;

int main()
{
	string s;
	string ans = "";

	cin >> s;

	for (int i = 0; i < s.size(); i++)
	{
		if (i == 0)
		{
			ans += s[i];
		}
		else if(s[i] == '-')
		{
			ans += s[i + 1];
		}
	}

	cout << ans << endl;

	return 0;
}

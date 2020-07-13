#include <iostream>
#include <string>

using namespace std;

int main()
{
	int l, cnt = 0;
	bool isStarted = false;
	string s;

	getline(cin, s);

	l = s.length();

	for (int i = 0; i < l; i++)
		if (i == 0)
		{
			if (s[i] != ' ')
			{
				isStarted = true;
				cnt++;
			}
		}
		else if(s[i] == ' ' && isStarted)
		{
			isStarted = false;
		}
		else if(s[i] != ' ' && !isStarted)
		{
			isStarted = true;
			cnt++;
		}

	cout << cnt << endl;

	return 0;
}

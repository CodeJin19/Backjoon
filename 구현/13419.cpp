#include <iostream>
#include <string>

using namespace std;

int main()
{
	int t, l;
	string s;
	
	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> s;

		l = s.length();

		if (l == 1)
		{
			cout << s << endl;
			cout << s << endl;
		}
		else if(l % 2 == 0)
		{
			for (int i = 0; i < l;)
			{
				cout << s[i];
				i += 2;
			}
			cout << endl;

			for (int i = 1; i < l;)
			{
				cout << s[i];
				i += 2;
			}
			cout << endl;
		}
		else
		{
			for (int i = 0; i < l;)
			{
				cout << s[i];
				i += 2;
			}
			for (int i = 1; i < l;)
			{
				cout << s[i];
				i += 2;
			}
			cout << endl;

			for (int i = 1; i < l;)
			{
				cout << s[i];
				i += 2;
			}
			for (int i = 0; i < l;)
			{
				cout << s[i];
				i += 2;
			}
			cout << endl;
		}
	}

	return 0;
}

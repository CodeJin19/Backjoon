#include <iostream>
#include <string>
#include <math.h>

using namespace std;

int main()
{
	string s;
	int t, len;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> s;

		len = sqrt(s.length());

		for (int i = len - 1; 0 <= i; i--)
		{
			for (int j = 0; j < len; j++)
			{
				cout << s[i + (j * len)];
			}
		}
		cout << endl;
	}
	
	return 0;
}

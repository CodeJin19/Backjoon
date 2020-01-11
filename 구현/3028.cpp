#include <iostream>
#include <string>

using namespace std;

int main()
{
	int pos = 1;
	string s;

	cin >> s;

	for (int i = 0; i < s.length(); i++)
	{
		switch (s[i])
		{
		case 'A':
			if (pos == 1)
			{
				pos = 2;
			}
			else if (pos == 2)
			{
				pos = 1;
			}
			break;
		case 'B':
			if (pos == 2)
			{
				pos = 3;
			}
			else if (pos == 3)
			{
				pos = 2;
			}
			break;
		case 'C':
			if (pos == 1)
			{
				pos = 3;
			}
			else if (pos == 3)
			{
				pos = 1;
			}
			break;
		}
	}

	cout << pos << endl;

	return 0;
}

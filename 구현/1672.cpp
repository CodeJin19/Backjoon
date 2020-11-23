#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int table[4][4] = { {0, 2, 0, 1},
						{2, 1, 3, 0},
						{0, 3, 2, 1},
						{1, 0, 1, 3} };
	int n, x, y;

	cin >> n >> s;

	for (int i = 0; i < n; i++)
	{
		switch (s[i])
		{
		case 'A':
			s[i] = '0';
			break;
		case 'G':
			s[i] = '1';
			break;
		case 'C':
			s[i] = '2';
			break;
		case 'T':
			s[i] = '3';
			break;
		}
	}

	for (int i = n - 2; 0 <= i; i--)
	{
		x = s[i] - '0';
		y = s[i + 1] - '0';

		s[i] = (char)('0' + table[x][y]);
		s[i + 1] = '\0';
	}

	switch (s[0])
	{
	case '0':
		cout << "A\n";
		break;
	case '1':
		cout << "G\n";
		break;
	case '2':
		cout << "C\n";
		break;
	case '3':
		cout << "T\n";
		break;
	}

	return 0;
}

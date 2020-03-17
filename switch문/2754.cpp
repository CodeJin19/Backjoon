#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;

	cin >> s;

	switch (s[0])
	{
	case 'A':
		switch (s[1])
		{
		case '+':
			cout << "4.3\n";
			break;
		case '0':
			cout << "4.0\n";
			break;
		case '-':
			cout << "3.7\n";
			break;
		}
		break;
	case 'B':
		switch (s[1])
		{
		case '+':
			cout << "3.3\n";
			break;
		case '0':
			cout << "3.0\n";
			break;
		case '-':
			cout << "2.7\n";
			break;
		}
		break;
	case 'C':
		switch (s[1])
		{
		case '+':
			cout << "2.3\n";
			break;
		case '0':
			cout << "2.0\n";
			break;
		case '-':
			cout << "1.7\n";
			break;
		}
		break;
	case 'D':
		switch (s[1])
		{
		case '+':
			cout << "1.3\n";
			break;
		case '0':
			cout << "1.0\n";
			break;
		case '-':
			cout << "0.7\n";
			break;
		}
		break;
	case 'F':
		cout << "0.0\n";
		break;
	}

	return 0;
}

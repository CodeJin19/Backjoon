#include <iostream>

using namespace std;

int main()
{
	char arr[60];
	int cnt[10];
	int idx = 0;

	cin >> arr;

	for (int i = 0; i < 8; i++)
	{
		cnt[i] = 0;
	}

	while (arr[idx] != '\0')
	{
		switch (arr[idx])
		{
		case '1':
		case 'Q':
		case 'A':
		case 'Z':
			cnt[0]++;
			break;
		case '2':
		case 'W':
		case 'S':
		case 'X':
			cnt[1]++;
			break;
		case '3':
		case 'E':
		case 'D':
		case 'C':
			cnt[2]++;
			break;
		case '4':
		case 'R':
		case 'F':
		case 'V':
		case '5':
		case 'T':
		case 'G':
		case 'B':
			cnt[3]++;
			break;
		case '6':
		case 'Y':
		case 'H':
		case 'N':
		case '7':
		case 'U':
		case 'J':
		case 'M':
			cnt[4]++;
			break;
		case '8':
		case 'I':
		case 'K':
		case ',':
			cnt[5]++;
			break;
		case '9':
		case 'O':
		case 'L':
		case '.':
			cnt[6]++;
			break;
		case '0':
		case 'P':
		case ';':
		case '/':
		case '-':
		case '[':
		case '\'':
		case '=':
		case ']':
			cnt[7]++;
			break;
		}

		idx++;
	}

	for (int i = 0; i< 8; i++)
	{
		cout << cnt[i] << endl;
	}

	return 0;
}

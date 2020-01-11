#include <iostream>

using namespace std;

int main()
{
	char arr[110];
	int cnt = 0;
	int idx = 0;

	cin >> arr;

	while (arr[idx] != '\0')
	{
		switch (arr[idx])
		{
		case 'c':
			if (arr[idx + 1] == '=' || arr[idx + 1] == '-')
			{
				idx++;
			}
			break;
		case 'd':
			if (arr[idx + 1] == '-')
			{
				idx++;
			}
			else if (arr[idx + 1] == 'z' && arr[idx + 2] == '=')
			{
				idx += 2;
			}
			break;
		case 'l':
			if (arr[idx + 1] == 'j')
			{
				idx++;
			}
			break;
		case 'n':
			if (arr[idx + 1] == 'j')
			{
				idx++;
			}
			break;
		case 's':
			if (arr[idx + 1] == '=')
			{
				idx++;
			}
			break;
		case 'z':
			if (arr[idx + 1] == '=')
			{
				idx++;
			}
			break;
		}

		cnt++;
		idx++;
	}

	cout << cnt << endl;
	
	return 0;
}

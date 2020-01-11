#include <iostream>

using namespace std;

int main()
{
	int T, cnt, idx;
	char arr[60];
	bool flag;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		idx = 0;
		cnt = 0;
		flag = true;

		cin >> arr;

		while (arr[idx] != '\0')
		{
			if (arr[idx] == '(')
			{
				cnt++;
			}
			else if(cnt <= 0)
			{
				flag = false;
				break;
			}
			else
			{
				cnt--;
			}

			idx++;
		}

		if (cnt != 0 && flag)
		{
			flag = false;
		}

		if (flag)
		{
			cout << "YES\n";
		}
		else
		{
			cout << "NO\n";
		}
	}

	return 0;
}

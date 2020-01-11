#include <iostream>

using namespace std;

int main()
{
	int now, next, flag;
	int arr[8];

	for (int i = 0; i < 8; i++)
	{
		cin >> arr[i];
	}

	now = 0;
	flag = 1;

	while (now != 7)  //ascending test
	{
		next = now + 1;

		if (arr[next] < arr[now])
		{
			flag = 0;
			break;
		}

		now++;
	}

	if (flag == 0)
	{
		now = 0;
		flag = 2;

		while (now != 7)  //descending test
		{
			next = now + 1;

			if (arr[now] < arr[next])
			{
				flag = 0;
				break;
			}

			now++;
		}

		if (flag == 2)
		{
			cout << "descending\n";
		}
		else
		{
			cout << "mixed\n";
		}
	}
	else
	{
		cout << "ascending\n";
	}

	return 0;
}

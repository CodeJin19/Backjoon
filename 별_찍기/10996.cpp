#include <iostream>

using namespace std;

int main()
{
	int n, flag;

	cin >> n;

	if (n == 1)
	{
		cout << "*\n";
	}
	else
	{
		flag = 1;

		for (int i = 0; i < n * 2; i++)
		{
			if (flag == 0)  //짝수 라인
			{
				for (int j = 0; j < n / 2; j++)
				{
					cout << " *";
				}
				cout << "\n";

				flag = 1;
			}
			else  //홀수 라인
			{
				for (int j = 0; j < (n + 1) / 2; j++)
				{
					cout << "* ";
				}
				cout << "\n";

				flag = 0;
			}
		}
	}

	return 0;
}

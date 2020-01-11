#include <iostream>

using namespace std;

int main()
{
	int n, len;

	cin >> n;

	len = (n - 1) * 2 ;
		
	for (int i = 0; i < len; i++)  //위의 절반
	{
		if (i % 2 == 0)  //홀수 번째 줄
		{
			for (int j = 0; j < i / 2 ; j++)
			{
				cout << "* ";
			}

			for (int j = 0; j < len * 2 + 1 - (i * 2); j++)  //가운데 연속된 *
			{
				cout << "*";
			}

			for (int j = 0; j < i / 2; j++)
			{
				cout << " *";
			}
			cout << "\n";
		}
		else  //짝수 번째 줄
		{
			for (int j = 0; j < (i + 1) / 2; j++)
			{
				cout << "* ";
			}

			for (int j = 0; j < len * 2 + 1 - (i + 1) * 2; j++)  //가운데 연속된 공백
			{
				cout << " ";
			}

			for (int j = 0; j < (i + 1) / 2; j++)
			{
				cout << " *";
			}

			cout << "\n";
		}
	}

  //가운데 줄
	cout << "*";

	for (int i = 0; i < len; i++)
	{
		cout << " *";
	}
	cout << "\n";


	for (int i = len - 1; 0 <= i; i--)  //아래 절반
	{
		if (i % 2 == 0)  //홀수 번째 줄
		{
			for (int j = 0; j < i / 2; j++)
			{
				cout << "* ";
			}

			for (int j = 0; j < len * 2 + 1 - (i * 2); j++)  //가운데 연속된 *
			{
				cout << "*";
			}

			for (int j = 0; j < i / 2; j++)
			{
				cout << " *";
			}
			cout << "\n";
		}
		else  //짝수 번째 줄
		{
			for (int j = 0; j < (i + 1) / 2; j++)
			{
				cout << "* ";
			}

			for (int j = 0; j < len * 2 + 1 - (i + 1) * 2; j++)  //가운데 연속된 공백
			{
				cout << " ";
			}

			for (int j = 0; j < (i + 1) / 2; j++)
			{
				cout << " *";
			}

			cout << "\n";
		}
	}

	return 0;
}

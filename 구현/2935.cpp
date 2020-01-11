#include <iostream>

using namespace std;

int main()
{
	int idx = 0;
	int alen = 0;
	int blen = 0;
	char arr[110];
	char brr[110];
	char sig;

	cin >> arr >> sig >> brr;

	while (arr[alen] != '\0')
	{
		alen++;
	}

	while (brr[blen] != '\0')
	{
		blen++;
	}

	if (sig == '+')  //덧셈의 경우
	{
		if (alen < blen)
		{
			cout << 1;

			for (int i = blen - 1; 0 < i; i--)
			{
				if (i == alen)
				{
					cout << 1;
				}
				else
				{
					cout << 0;
				}
			}
		}
		else if (alen == blen)
		{
			cout << 2;

			for (int i = 1; i < blen; i++)
			{
				cout << 0;
			}
		}
		else
		{
			cout << 1;

			for (int i = alen - 1; 0 < i; i--)
			{
				if (i == blen)
				{
					cout << 1;
				}
				else
				{
					cout << 0;
				}
			}
		}
	}
	else  //곱셈의 경우
	{
		cout << 1;

		for (int i = 0; i < alen + blen - 2; i++)
		{
			cout << 0;
		}
	}

	cout << endl;

	return 0;
}

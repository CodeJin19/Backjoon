#include <iostream>

using namespace std;

int main()
{
	char arr[35];
	char brr[35];
	int adx = 0;
	int bdx = 0;
	int a = -1;  //문자열 A에서 문자열 B와 겹치는 알파벳의 위치
	int b = -1;  //문자열 B에서 문자열 B와 겹치는 알파벳의 위치
	int alen = 0;
	int blen = 0;

	cin >> arr >> brr;

	//문자열 A와 문자열 B가 겹치는 알파벳 위치 찾기
	while (arr[adx] != '\0' && a == -1)
	{
		bdx = 0;

		while (brr[bdx] != '\0' && b == -1)
		{
			if (arr[adx] == brr[bdx])
			{
				a = adx;
				b = bdx;
			}

			bdx++;
		}

		adx++;
	}

	while (arr[alen] != '\0')
	{
		alen++;
	}

	while (brr[blen] != '\0')
	{
		blen++;
	}

	//출력
	for (int i = 0; i < blen; i++)
	{
		if (i != b)
		{
			for (int j = 0; j < alen; j++)
			{
				if (j != a)
				{
					cout << '.';
				}
				else
				{
					cout << brr[i];
				}
			}

			cout << "\n";
		}
		else
		{
			cout << arr << "\n";
		}
	}

	return 0;
}

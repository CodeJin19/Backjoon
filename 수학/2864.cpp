#include <iostream>

using namespace std;

int main()
{
	char arr[10];
	char brr[10];
	int alen = 0;
	int blen = 0;
	int a, b;

	cin >> arr >> brr;

	while (arr[alen] != '\0')  //첫번째 숫자 길이 구하면서 6은 5로 변경
	{
		if (arr[alen] == '6')
		{
			arr[alen] = '5';
		}

		alen++;
	}

	while (brr[blen] != '\0')  //두번째 숫자 길이 구하면서 6은 5로 변경
	{
		if (brr[blen] == '6')
		{
			brr[blen] = '5';
		}

		blen++;
	}

	//배열에서 정수형으로 전환
	a = 0;

	for (int i = 0; i < alen; i++)
	{
		a += arr[i] - '0';
		a *= 10;
	}

	a /= 10;

	//배열에서 정수형으로 전환
	b = 0;

	for (int i = 0; i < blen; i++)
	{
		b += brr[i] - '0';
		b *= 10;
	}

	b /= 10;

	cout << a + b << " ";

	//5를 6으로 변경
	a = 0;

	for (int i = 0; i < alen; i++)
	{
		if (arr[i] == '5')
		{
			arr[i] = '6';
		}

		a += arr[i] - '0';
		a *= 10;
	}

	a /= 10;

	//5를 6으로 변경
	b = 0;

	for (int i = 0; i < blen; i++)
	{
		if (brr[i] == '5')
		{
			brr[i] = '6';
		}

		b += brr[i] - '0';
		b *= 10;
	}

	b /= 10;

	cout << a + b << endl;
    
	return 0;
}

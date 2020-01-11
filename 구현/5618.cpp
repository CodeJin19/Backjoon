#include <iostream>

using namespace std;

int euc(int x, int y)  //x와 y의 최대 공약수 (단, y < x)
{
	int r = x % y;

	if (r == 0)
	{
		return y;
	}
	else
	{
		euc(y, r);
	}
}

int main()
{
	int n, a, b, c, num;

	cin >> n;

	cin >> a >> b;

	if (n == 3)  //수가 3개인 경우
	{
		cin >> c;
	}

	if (a < b)  //일단 a와 b의 최대공약수 구하기
	{
		num = euc(b, a);
	}
	else
	{
		num = euc(b, a);
	}

	if (n == 3)  //수가 3개인 경우 a와 b의 최대공약수와 c의 최대공약수 구하기
	{
		if (num < c)
		{
			num = euc(c, num);
		}
		else
		{
			num = euc(num, c);
		}
	}

	for (int i = 1; i <= num; i++)  //최대공약수의 인수 출력
	{
		if (num % i == 0)
		{
			cout << i << "\n";
		}
	}

	return 0;
}

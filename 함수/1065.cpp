#include <iostream>

using namespace std;

bool han (int num)  //num이 한수이면, 참을 return
{
	int a, b, c;

	if (num < 100)  //두 자리 수는 무조건 한수
	{
		return true;
	}
	else if(num == 1000)  //1000은 예외처리
	{
		return false;
	}
	else  //세 자리 수의 경우
	{
		//a : 100의 자리 수
		//b : 10의 자리 수
		//c : 1의 자리 수
		
		c = num % 10;
		num /= 10;
		b = num % 10;
		num /= 10;
		a = num;

		if (b * 2 == a + c)  //등차수열 검증
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

int main()
{
	int num;
	int cnt = 0;

	cin >> num;

	for (int i = 1; i <= num; i++)
	{
		if (han(i))
		{
			cnt++;
		}
	}
	cout << cnt << endl;
	
	return 0;
}

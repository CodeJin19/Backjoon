#include <iostream>

using namespace std;

int main()
{
	int num, a, b;
	int max = 1;
	int add = 2;

	cin >> num;

	while (max < num)  //num번째 분수가 있는 줄 찾기
	{
		max += add;
		add++;
	}

	add--;

	if (add % 2 == 0)  //짝수 줄인 경우
	{
		a = num - (max - add);
		b = add - a + 1;
		cout << a << "/" << b << endl;
	}
	else  //홀수 줄인 경우
	{
		b = num - (max - add);
		a = add - b + 1;
		cout << a << "/" << b << endl;
	}

	return 0;
}

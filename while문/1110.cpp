#include <iostream>

using namespace std;

int main()
{
	int num, a, b, c;
	int cnt = 0;
	int next = 0;

	cin >> num;
	next = num;

	do  //연산 진행 및 횟수 증가
	{
		a = next % 10;
		b = next / 10;
		c = a + b;
		next = (a * 10) + (c % 10);
		cnt++;
	}
	while (next != num);

	cout << cnt << endl;

	return 0;
}

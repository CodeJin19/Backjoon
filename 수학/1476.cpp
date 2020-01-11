#include <iostream>

using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	while (a != b || b != c)  //a = b = c인 상태가 될때까지 반복
	{
		if (a < b) //가장 작은 항목을 증가
		{
			if (c < a)
			{
				c += 19;
			}
			else
			{
				a += 15;
			}
		}
		else
		{
			if (c < b)
			{
				c += 19;
			}
			else
			{
				b += 28;
			}
		}
	}

	cout << a << endl;

	return 0;
}

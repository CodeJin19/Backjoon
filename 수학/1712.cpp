#include <iostream>

using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	if (c <= b)  //판매가 < 가변비용 이므로 고정비용을 충당할 수 없다
	{
		cout << "-1\n";
	}
	else
	{
		c -= b;
		a /= c;
		cout << a + 1 << "\n";
	}

	return 0;
}

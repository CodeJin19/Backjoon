#include <iostream>

using namespace std;

int main()
{
	int n, f, r;

	cin >> n >> f;

	//n의 일의 자리와 십의 자리를 00으로 바꾼다
	n /= 100;
	n *= 100;

	//~00으로 조정된 n을 f로 나눌 경우 나머지를 구한다
	r = n % f;

	if (r != 0)  //나머지가 0이 아닌 경우 f - r만큼을 n에 더한다
	{
		n += (f - r);
	}

	if ((n % 100) < 10)  //조정된 끝 두 자리가 한 자리 숫자일 경우 앞에 0을 출력한다
	{
		cout << "0";
	}

	cout << n % 100 << endl;

	return 0;
}

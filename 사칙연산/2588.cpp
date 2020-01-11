#include <iostream>

using namespace std;

int main()
{
	int a, b, c, ans;

	cin >> a >> b;

	ans = a * b;

	while (b != 0)			     		//b를 한 자리씩 분리
	{
		c = b % 10;
		b /= 10;
		
		cout << a * c << "\n";    //중간 곱의 결과 출력
	}

	cout << ans << "\n";			  //최종 답 출력

	return 0;
}

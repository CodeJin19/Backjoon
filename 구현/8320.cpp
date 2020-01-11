#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int n, idx, x;
	int cnt = 0;

	cin >> n;
	
	for (int i = 1; i <= n; i++)
	{
		idx = 1;

		while (idx * i <= n)  //idx * i인 사각형의 개수 세기
		{
			cnt++;
			idx++;
		}
	}

	x = sqrt(n);  //넓이가 n이하인 정사각형의 개수
	cnt -= x;  //(전체 갯수 - 정사각형의 개수) / 2 + 정사각형의 개수
	cnt /= 2;
	cnt += x;
	cout << cnt << endl;

	return 0;
}

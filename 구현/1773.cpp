#include <iostream>

using namespace std;

int time[2000010];  //시간 배열
int period[100];

int main()
{
	int n, c, idx, x;
	int sum = 0;

	cin >> n >> c;

	for (int i = 0; i < n; i++)
	{
		cin >> period[i];
	}

	for (int i = 1; i <= c; i++)  //시간 배열 초기화
	{
		time[i] = 0;
	}

	for (int i = 0; i < n; i++)  //n개의 폭죽
	{
		x = period[i];
		idx = x;

		while (idx <= c)
		{
			time[idx] = 1;
			idx += x;
		}
	}

	for (int i = 1; i <= c; i++)  //불꽃을 볼 수 있는 시간
	{
		sum += time[i];
	}

	cout << sum << endl;

	return 0;
}

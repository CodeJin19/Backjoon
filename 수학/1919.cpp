#include <iostream>

using namespace std;

int main()
{
	int x;
	int sum = 0;
	int idx = 0;
	char arr[1010];
	char brr[1010];
	char cnt[30];

	for (int i = 0; i < 30; i++)  //cnt배열 초기화
	{
		cnt[i] = 0;
	}

	cin >> arr >> brr;

	while (arr[idx] != '\0')  //문자열 a에 들어있는 알파벳의 갯수만큼 ++
	{
		cnt[(arr[idx] - 'a')] += 1;
		idx++;
	}

	idx = 0;

	while (brr[idx] != '\0')  //문자열 b에 있는 알파벳의 갯수만큼 --
	{
		cnt[(brr[idx] - 'a')] -= 1;
		idx++;
	}

	for (int i = 0; i < 30; i++)  //cnt의 갯수만큼 삭제해야한다
	{
		if (cnt[i] < 0)
		{
			x = 0 - cnt[i];
		}
		else
		{
			x = cnt[i];
		}

		sum += x;
	}

	cout << sum << endl;

	return 0;
}

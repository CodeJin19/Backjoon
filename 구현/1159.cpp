#include <iostream>

using namespace std;

int main()
{
	int n, x;
	int sum = 0;
	int cnt[30];  //각 알파벳 성씨의 명수
	char arr[40];

	cin >> n;

	for (int i = 0; i < 30; i++)
	{
		cnt[i] = 0;
	}

	for (int i = 0; i < n; i++)  //n명의 선수이름 입력 후, 알파벳 확인
	{
		cin >> arr;

		x = arr[0] - 'a';
		cnt[x] += 1;
	}

	//출력
	for (int i = 0; i < 30; i++)
	{
		if (5 <= cnt[i])
		{
			cout << (char)('a' + i);
			sum++;
		}
	}

	if (sum == 0)
	{
		cout << "PREDAJA\n";
	}

	return 0;
}

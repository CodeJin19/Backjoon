#include <iostream>

using namespace std;

int pri[500];
int idx;

int main()
{
	int T, num;
	int cnt = 0;
	bool flag;

	cin >> T;

	//1000이하의 소수 찾기
	
	pri[0] = 2;
	idx = 1;

	for (num = 3; num < 1000;)
	{
		flag = true;

		for (int j = 0; j < idx; j++)
		{
			if (num % pri[j] == 0)
			{
				flag = false;
				break;
			}
		}

		if (flag)
		{
			pri[idx] = num;
			idx++;
		}

		num += 2;
	}

	for (int itr = 0; itr < T; itr++)
	{
		cin >> num;

		for (int i = 0; i < idx; i++) //입력받은 수가 소수인지 확인
		{
			if (num == pri[i])
			{
				cnt++;
				break;
			}
		}
	}

	cout << cnt << endl;

	return 0;
}

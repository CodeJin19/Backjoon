#include <iostream>

using namespace std;

int pri[5000];
int idx;

int main()
{
	int num, m, n, sum;
	int min = 0;
	bool flag;

	pri[0] = 2;
	idx = 1;

	for (num = 3; num < 10000;)  //10000이하의 소수 찾기
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

	cin >> m >> n;

	//m이상 n이하
	while (pri[min] < m)
	{
		min++;
	}

	idx = min;
	min = pri[idx];
	sum = 0;

	while (pri[idx] <= n)
	{
		sum += pri[idx];
		idx++;
	}

	if (sum == 0)
	{
		cout << "-1\n";
	}
	else
	{
		cout << sum << endl << min << endl;
	}

	return 0;
}

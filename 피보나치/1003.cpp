#include <iostream>

using namespace std;

int main()
{
	int T, n;
	int idx = 0;
	int cache[50][2];  //cache[n][i] : fibonacci(n)을 호출했을 때, i가 나온 횟수 (i : 0 or 1)

	cin >> T;
  
  //fibonacci(0)은 0이 한 번, 1이 영 번 나온다
	cache[idx][0] = 1;
	cache[idx][1] = 0;
	idx++;

  //fibonacci(1)은 0이 영 번, 1이 한 번 나온다
	cache[idx][0] = 0;
	cache[idx][1] = 1;
	idx++;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> n;

		if (n < idx)  //n < idx이면, cache 참조
		{
			cout << cache[n][0] << " " << cache[n][1] << "\n";
		}
		else  //idx <= n이면, n까지 연산
		{
			while (idx != n + 1)
			{
				cache[idx][0] = cache[idx - 1][0] + cache[idx - 2][0];
				cache[idx][1] = cache[idx - 1][1] + cache[idx - 2][1];
				idx++;
			}

			cout << cache[n][0] << " " << cache[n][1] << "\n";
		}
	}

	return 0;
}

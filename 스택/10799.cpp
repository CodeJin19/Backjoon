#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int idx = 0;
	int cnt = 0;
	int sum = 0;

	cin >> s;

	while (idx != s.size())
	{
		if (s[idx] == '(')
		{
			if (s[idx + 1] == ')')  //레이저라면 cnt만큼 잘라서 sum에 더하기
			{
				sum += cnt;
				idx++;
			}
			else  //쇠막대기의 시작이라면 cnt++
			{
				cnt++;
			}
		}
		else if(s[idx] = ')')  //쇠막대기의 끝이라면 cnt--, sum++
		{
			sum++;
			cnt--;
		}

		idx++;
	}

	cout << sum << endl;

	return 0;
}

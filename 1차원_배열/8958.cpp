#include <iostream>
#include <string>

using namespace std;

int main()
{
	int T;
	string s;
	int sum, score, idx;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> s;

		sum = 0;
		score = 0;
		idx = 0;

		while (idx < s.length())
		{
			if (s[idx] == 'O')  //맞으면 점수 누적 증가
			{
				score++;
				sum += score;
			}
			else  //틀리면 점수 0으로 초기화
			{
				score = 0;
			}

			idx++;
		}

		cout << sum << "\n";
	}

	return 0;
}

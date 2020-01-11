#include <string>
#include <iostream>

using namespace std;

int main()
{
	string s;
	int cnt = 0;

	for (int i = 0; i < 8; i++)
	{
		cin >> s;

		if (i % 2 == 0)  //짝수번째 줄인 경우
		{
			for (int j = 0; j < s.size();)  //짝수 칸만 확인
			{
				if (s[j] == 'F')
				{
					cnt++;
				}

				j += 2;
			}
		}
		else  //홀수번째 줄인 경우
		{
			for (int j = 1; j < s.size();)  //홀수 칸만 확인
			{
				if (s[j] == 'F')
				{
					cnt++;
				}
				
				j += 2;
			}
		}
	}

	cout << cnt << endl;
    
	return 0;
}

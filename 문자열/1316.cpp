#include <iostream>

using namespace std;

int main()
{
	int T, idx, x, cnt;
	int chk[26];  //알파벳 검사 배열
	char arr[110];  //문자열 입력

	cin >> T;
	cnt = T;

	for (int itr = 0; itr < T; itr++)
	{
		idx = 0;

		cin >> arr;

		for (int i = 0; i < 26; i++)  //배열 0으로 초기화
		{
			chk[i] = 0;
		}

		while (arr[idx] != '\0')  //단어 검사 반복문
		{
			x = arr[idx] - 'a';

			if (chk[x] == 0)  //알파벳이 처음 나온 경우
			{
				chk[x] = 1;
				x = idx;

				while (arr[x] == arr[idx + 1])
				{
					idx++;
				}
			}
			else  //나왔던 알파벳이 다시 나온 경우, cnt를 줄이고, 반복문 탈출
			{
				cnt--;
				break;
			}

			idx++;
		}
	}

	cout << cnt << endl;

	return 0;
}

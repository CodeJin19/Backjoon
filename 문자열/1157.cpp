#include <iostream>

using namespace std;

int main()
{
	char arr[1000010];
	int cnt[26];  //각 알파벳이 나온 횟수
	int max = 0;
	int idx = 0;
	int mdx = -1;
	int x;
	bool flag = true;

	for (int i = 0; i < 26; i++)
	{
		cnt[i] = 0;
	}

	cin >> arr;

	while (arr[idx] != '\0')
	{
		if ('a' <= arr[idx] && arr[idx] <= 'z')  //소문자의 경우
		{
			x = arr[idx] - 'a';
			cnt[x]++;
		}
		else  //대문자의 경우
		{
			x = arr[idx] - 'A';
			cnt[x]++;
		}

		idx++;
	}

	for (int i = 0; i < 26; i++)  //최대횟수 찾기
	{
		if(max < cnt[i])
		{
		    max = cnt[i];
		    mdx = i;
		}
	}
    
    	for(int i = 0; i < 26; i++)  //최대횟수가 같은 알파벳이 있는지 검사
	{
		if(max == cnt[i] && mdx != i)
		{
		    flag = false;
		}
    	}

	if (flag)
	{
		cout << (char)('A' + mdx) << endl;
	}
	else
	{
		cout << "?\n";
	}

	return 0;
}

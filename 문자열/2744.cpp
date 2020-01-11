#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int x;

	cin >> s;

	for (int i = 0; i < s.length(); i++)
	{
		if ('a' <= s[i] && s[i] <= 'z')  //소문자면 대문자로 변환
		{
			x = (int)s[i];
			x -= (int)'a';
			x += (int)'A';
			s[i] = x;
		}
		else  //대문자면 소문자로 변환
		{
			x = (int)s[i];
			x -= (int)'A';
			x += (int)'a';
			s[i] = x;
		}
	}

	cout << s << endl;

	return 0;
}

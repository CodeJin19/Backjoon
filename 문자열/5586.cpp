#include <iostream>
#include <string>

using namespace std;

int main()
{
	int joi_cnt = 0;
	int ioi_cnt = 0;
	string s;

	cin >> s;

	for (int i = 0; i < s.length() - 2; i++)
	{
		if (s[i] == 'J' && s[i + 1] == 'O' && s[i + 2] == 'I')
		{
			joi_cnt++;
		}
	}

	for (int i = 0; i < s.length() - 2; i++)
	{
		if (s[i] == 'I' && s[i + 1] == 'O' && s[i + 2] == 'I')
		{
			ioi_cnt++;
		}
	}

	cout << joi_cnt << endl << ioi_cnt << endl;

	return 0;
}

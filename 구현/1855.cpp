#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector <vector <char>> code;
	vector <char> tmp;
	string s;
	int n;
	bool LtoR = true;

	cin >> n >> s;

	for (int i = 0; i < s.length();)
	{
		tmp.clear();

		if (LtoR)
		{
			for (int idx = 0; idx < n; idx++)
			{
				tmp.push_back(s[i + idx]);
			}

			code.push_back(tmp);
			LtoR = false;
		}
		else
		{
			for (int idx = n - 1; 0 <= idx; idx--)
			{
				tmp.push_back(s[i + idx]);
			}

			code.push_back(tmp);
			LtoR = true;
		}

		i += n;
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < code.size(); j++)
		{
			cout << code[j][i];
		}
	}
	cout << endl;

	return 0;
}

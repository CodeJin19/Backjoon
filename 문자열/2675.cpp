#include <iostream>

using namespace std;

int main()
{
	int T, r, idx;
	char s[25];

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		idx = 0;

		cin >> r;
		cin >> s;

		while (s[idx] != '\0')  //반복 
		{
			for (int i = 0; i < r; i++)
			{
				cout << s[idx];
			}

			idx++;
		}

		cout << "\n";
	}

	return 0;
}

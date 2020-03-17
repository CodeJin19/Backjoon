#include <iostream>
#include <string>

using namespace std;

int main()
{
	int t, idx;
	string s;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> idx >> s;

		idx--;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (i != idx)
				cout << s[i];
		}

		cout << "\n";
	}

	return 0;
}

#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int idx = 0;
	
	cin >> s;

	cout << s[idx];
	idx++;

	while (idx < s.length())
	{
		if (idx % 10 == 0)
		{
			cout << "\n";
		}
		cout << s[idx];
		idx++;
	}

	return 0;
}

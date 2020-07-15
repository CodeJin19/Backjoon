#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	string s, tmp;

	cin >> s;

	while (s.compare("0") != 0)
	{
		tmp = s;

		reverse(tmp.begin(), tmp.end());

		if (tmp.compare(s) == 0)
			cout << "yes\n";
		else
			cout << "no\n";

		cin >> s;
	}
	
	return 0;
}

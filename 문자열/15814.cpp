#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	char tmp;
	int t, a, b;

	cin >> s >> t;

	for (int i = 0; i < t; i++)
	{
		cin >> a >> b;

		tmp = s[a];
		s[a] = s[b];
		s[b] = tmp;
	}

	cout << s << endl;

	return 0;
}

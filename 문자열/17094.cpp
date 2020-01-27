#include <iostream>
#include <string>
using namespace std;

int main()
{
	int len, n = 0, e = 0;
	string s;

	cin >> len >> s;

	for (int i = 0; i < len; i++)
	{
		if (s[i] == '2')
		{
			n++;
		}
		else
		{
			e++;
		}
	}

	if (n == e)
	{
		cout << "yee\n";
	}
	else if (e < n)
	{
		cout << "2\n";
	}
	else
	{
		cout << "e\n";
	}
	return 0;
}

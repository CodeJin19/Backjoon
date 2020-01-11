#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	string a, b;

	cin >> a;

	b = a;
	reverse(b.begin(), b.end());

	if (a == b)
	{
		cout << "true\n";
	}
	else
	{
		cout << "false\n";
	}

	return 0;
}

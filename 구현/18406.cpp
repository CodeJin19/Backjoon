#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int front = 0, back = 0, limit;

	cin >> s;

	limit = s.length() / 2;

	for (int i = 0; i < limit; i++)
		front += (s[i] - '0');

	for (int i = limit; i < s.length(); i++)
		back += (s[i] - '0');

	if (front == back)
		cout << "LUCKY\n";
	else
		cout << "READY\n";

	return 0;
}

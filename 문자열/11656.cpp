#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	vector <string> list;
	string s, x;

	cin >> s;

	for (int i = 0; i < s.length(); i++)
	{
		x = s[i];

		for (int j = i + 1; j < s.length(); j++)
		{
			x += s[j];
		}

		list.push_back(x);
	}

	sort(list.begin(), list.end());

	for (int i = 0; i < list.size(); i++)
	{
		cout << list[i] << "\n";
	}

	return 0;
}

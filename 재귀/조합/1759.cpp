#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

vector <char> list;
string str;

bool isValid()
{
	int v = 0, c = 0;

	for (int i = 0; i < str.length(); i++)
	{
		switch (str[i])
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			v++;
			break;
		default:
			c++;
			break;
		}

		if (1 <= v && 2 <= c)
			return true;
	}
	return false;
}

void getComb(int toSelect, int startIdx)
{
	if (toSelect == str.length())
	{
		if(isValid())
			cout << str << "\n";
		return;
	}

	for (int i = startIdx; i < list.size(); i++)
	{
		str[toSelect] = list[i];
		getComb(toSelect + 1, i + 1);
	}
}

int main()
{
	int l, c;
	char x;

	cin >> l >> c;

	for (int i = 0; i < c; i++) {
		cin >> x;
		list.push_back(x);
	}

	for (int i = 0; i < l; i++)
		str += " ";

	sort(list.begin(), list.end());

	getComb(0, 0);

	return 0;
}

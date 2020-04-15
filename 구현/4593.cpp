#include <iostream>
#include <string>

using namespace std;

void result(char p1, char p2, int * p1w, int * p2w)
{
	if (p1 == p2)
	{
		return;
	}

	switch (p1)
	{
	case 'R':
		if (p2 == 'S')
			*p1w += 1;
		else
			*p2w += 1;
		break;
	case 'S':
		if (p2 == 'P')
			*p1w += 1;
		else
			*p2w += 1;
		break;
	case 'P':
		if (p2 == 'R')
			*p1w += 1;
		else
			*p2w += 1;
		break;
	}
}

int main()
{
	string p1, p2;
	int p1w, p2w, len;

	cin >> p1 >> p2;

	while (p1[0] != 'E' || p2[0] != 'E')
	{
		p1w = 0;
		p2w = 0;
		len = p1.length();

		for (int i = 0; i < len; i++)
			result(p1[i], p2[i], & p1w, & p2w);

		cout << "P1: " << p1w << "\n";
		cout << "P2: " << p2w << "\n";

		cin >> p1 >> p2;
	}

	return 0;
}

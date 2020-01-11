#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> univ;
	int x, sum = 0, min = 2100000000, idx;

	for (int i = 0; i < 3; i++)
	{
		cin >> x;
		univ.push_back(x);

		sum += x;

		if (x < min)
		{
			min = x;
			idx = i;
		}
	}

	if (100 <= sum)
	{
		cout << "OK\n";
	}
	else
	{
		switch (idx)
		{
		case 0:
			cout << "Soongsil\n";
			break;
		case 1:
			cout << "Korea\n";
			break;
		case 2:
			cout << "Hanyang\n";
			break;
		}
	}

	return 0;
}

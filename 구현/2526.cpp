#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> list;
	int n, p, next, len;
	bool isThere;

	cin >> n >> p;

	list.push_back(n);
	next = n;

	while (1)
	{
		next *= n;
		next %= p;

		len = list.size();
		isThere = false;

		for (int i = 0; i < len; i++)
		{
			if (list[i] == next)
			{
				cout << len - i << endl;
				isThere = true;
				break;
			}
		}

		if (isThere)
		{

			break;
		}
		else
		{
			list.push_back(next);
		}
	}

	return 0;
}

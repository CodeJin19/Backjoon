#include <iostream>
#include <string>

using namespace std;

int main()
{
	int t, n, x, max;
	string s, name;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		max = -1;

		for (int i = 0; i < n; i++)
		{
			cin >> s >> x;

			if (max < x)
			{
				max = x;
				name = s;
			}
		}

		cout << name << endl;
	}

	return 0;
}

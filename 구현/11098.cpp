#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int t, max, idx, n, x;
	string s;
	vector <string> name;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		name.clear();
		max = -1;

		for (int i = 0; i < n; i++)
		{
			cin >> x >> s;

			name.push_back(s);

			if (max < x)
			{
				max = x;
				idx = i;
			}
		}

		cout << name[idx] << "\n";
	}

	return 0;
}

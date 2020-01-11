#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> year;
	int n;

	for (int i = 0; i < 4; i++)
	{
		cin >> n;
		year.push_back(n);
	}

	while (year[0] != 0 || year[1] != 0 || year[2] != 0 || year[3] != 0)
	{
		sort(year.begin(), year.end());

		cout << year[2] - year[1] << " " << year[3] - year[0] << endl;

		for (int i = 0; i < 4; i++)
		{
			cin >> n;
			year[i] = n;
		}
	}

	return 0;
}

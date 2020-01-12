#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> people;
	int x, y, r, n;
	bool flag = true;

	for (int i = 0; i < 4; i++)
	{
		cin >> n;
		people.push_back(n);
	}
	
	cin >> x >> y >> r;

	for (int i = 0; i < 4; i++)
	{
		if (people[i] == x)
		{
			cout << i + 1 << endl;
			flag = false;
		}
	}

	if (flag)
	{
		cout << 0 << endl;
	}

	return 0;
}

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> t;
	int x;

	for (int i = 0; i < 3; i++)
	{
		cin >> x;
		t.push_back(x);
	}
	
	while (t[0] != 0 || t[1] != 0 || t[2] != 0)
	{
		sort(t.begin(), t.end());

		if (t[0] == 0 || t[1] == 0 || t[2] == 0)
		{
			cout << "Invalid\n";
		}
		else if (t[0] == t[1] && t[1] == t[2])
		{
			cout << "Equilateral\n";
		}
		else if (t[0] + t[1] <= t[2])
		{
			cout << "Invalid\n";
		}
		else if (t[0] == t[1] || t[1] == t[2] || t[2] == t[0])
		{
			cout << "Isosceles\n";
		}
		else
		{
			cout << "Scalene\n";
		}

		cin >> t[0];
		cin >> t[1];
		cin >> t[2];
	}

	return 0;
}

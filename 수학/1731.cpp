#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> list;
	int n, x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		list.push_back(x);
	}

	if (list[0] + list[2] == list[1] + list[1])
	{
		x = list[n - 1];
		x -= list[n - 2];
		x += list[n - 1];

		cout << x << endl;
	}
	else
	{
		x = list[n - 1];
		x /= list[n - 2];
		x *= list[n - 1];

		cout << x << endl;
	}

	return 0;
}

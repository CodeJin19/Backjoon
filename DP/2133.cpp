#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n;
	vector <vector <int>> list;
	vector <int> tmp;

	cin >> n;

	tmp.push_back(0);
	tmp.push_back(0);
	tmp.push_back(0);
	tmp.push_back(0);

	for (int i = 0; i < n + 4; i++)
		list.push_back(tmp);

	list[1][1] = 1;
	list[1][3] = 1;

	list[2][0] = 3;
	list[2][1] = 0;
	list[2][3] = 0;

	for (int i = 2; i < 3; i++)
	{
		list[i + 1][0] = list[i - 1][0];
		list[i + 1][1] = list[i - 1][1];
		list[i + 1][3] = list[i - 1][3];
	}

	for (int i = 3; i <= n; i++)
	{
		list[i][0] += list[i - 1][1] + list[i - 1][3];
		list[i][1] += list[i - 1][0];
		list[i][3] += list[i - 1][0];

		list[i + 1][0] += list[i - 1][0];
		list[i + 1][1] += list[i - 1][1];
		list[i + 1][3] += list[i - 1][3];
	}

	cout << list[n][0] << endl;

	return 0;
}

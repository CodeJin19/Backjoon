#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> list;
	int n;

	cin >> n;
	list.push_back(n);
	cin >> n;
	list.push_back(n);
	cin >> n;
	list.push_back(n);

	sort(list.begin(), list.end());

	for (int i = 0; i < 3; i++)
	{
		cout << list[i] << " ";
	}
	cout << "\n";
	return 0;
}

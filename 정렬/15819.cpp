#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	vector <string> list;
	int n, x;
	string s;

	cin >> n >> x;

	for (int i = 0; i < n; i++)
	{
		cin >> s;
		list.push_back(s);
	}

	sort(list.begin(), list.end());

	cout << list[x - 1] << endl;

	return 0;
}

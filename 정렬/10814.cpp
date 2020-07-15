#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main()
{	
	int n, age;
	string s;
	vector <int> tmp;
	vector <string> name;
	vector <vector <int>> list;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		tmp.clear();

		cin >> age >> s;

		tmp.push_back(age);
		tmp.push_back(i);

		list.push_back(tmp);
		name.push_back(s);
	}

	sort(list.begin(), list.end());

	for (int i = 0; i < n; i++)
	{
		cout << list[i][0] << " " << name[list[i][1]] << "\n";
	}
	
	return 0;
}

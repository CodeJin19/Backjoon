#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> list;
	int num = 1, a, b;

	list.push_back(0);

	while (list.size() <= 1000)
	{
		for (int i = 0; i < num; i++)
		{
			list.push_back(list[list.size() - 1] + num);
		}

		num++;
	}
	
	cin >> a >> b;

	cout << list[b] - list[a - 1] << endl;
	
	return 0;
}

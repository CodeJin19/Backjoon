#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int k, num, sum;
	vector <int> list;

	cin >> k;

	for (int i = 0; i < k; i++)
	{
		cin >> num;

		if (num == 0)
		{
			list.pop_back();
		}
		else
		{
			list.push_back(num);
		}
	}

	sum = 0;

	for (int i = 0; i < list.size(); i++)
	{
		sum += list[i];
	}

	cout << sum << endl;

	return 0;
}

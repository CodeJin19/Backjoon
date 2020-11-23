#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> list;
	int n, x, cnt, max;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		list.push_back(x);
	}

	max = 0;
	cnt = 0;

	for (int i = 0; i < n; i++)
	{
		if (max < list[i])
		{
			cnt++;
			max = list[i];
		}
	}

	cout << cnt << "\n";

	max = 0;
	cnt = 0;

	for (int i = n - 1; 0 <= i; i--)
	{
		if (max < list[i])
		{
			cnt++;
			max = list[i];
		}
	}

	cout << cnt << "\n";

	return 0;
}

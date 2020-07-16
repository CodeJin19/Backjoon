#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <int> list;

bool isThere(int x)
{
	int from = 0, to = list.size() - 1, mid;

	while (from <= to)
	{
		mid = from + to;
		mid /= 2;

		if (x == list[mid])
			return true;
		else if (x < list[mid])
			to = mid - 1;
		else
			from = mid + 1;
	}

	return false;
}

int main()
{
	int n, x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		scanf("%d", &x);

		list.push_back(x);
	}

	sort(list.begin(), list.end());

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		scanf("%d", &x);

		if (isThere(x))
			printf("1\n");
		else
			printf("0\n");
	}

	return 0;
}

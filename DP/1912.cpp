#include <iostream>
#include <vector>

using namespace std;

vector <int> list;
vector <int> cache;

int getMax(int start, int present)
{
	int ret;
	cache[start] = present;

	if (start == (list.size() - 1))
	{
		return cache[start];
	}

	if (present < present + cache[start + 1])
	{
		cache[start] += cache[start + 1];
	}

	return cache[start];
}

int main()
{
	int n, num;
	int max = -1234;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> num;
		list.push_back(num);
		cache.push_back(-1);
	}

	for (int i = list.size() - 1; 0 <= i; i--)
	{
		num = getMax(i, list[i]);

		if (max < num)
		{
			max = num;
		}
	}

	cout << max << endl;

	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

vector <int> stair;
vector <vector <int>> cache;
int n;

int max(int x, int y)
{
	if (x < y)
	{
		return y;
	}
	else
	{
		return x;
	}
}

int solve(int now, int cons)
{
	int a, b;

	if (n < now)
	{
		return -2100000000;
	}else if (cache[cons][now] != -1)
	{
		return cache[cons][now];
	}
	else if (now == n)
	{
		cache[cons][now] = stair[now];
		return stair[now];
	}
	
	switch (cons)
	{
	case 0:
	case 1:
		a = solve(now + 1, cons + 1);
		b = solve(now + 2, 1);

		if (a < b)
		{
			cache[cons][now] = b + stair[now];
		}
		else
		{
			cache[cons][now] = a + stair[now];
		}
		break;
	case 2:
		cache[cons][now] = solve(now + 2, 1) + stair[now];
		break;
	}

	return cache[cons][now];
}

int main()
{
	int x;
	vector <int> tmp;

	cin >> n;

	stair.push_back(0);
	tmp.push_back(-1);

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		stair.push_back(x);
		tmp.push_back(-1);
	}

	cache.push_back(tmp);
	cache.push_back(tmp);
	cache.push_back(tmp);

	cout << solve(0, 0) << endl;

	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

vector <int> time;
vector <int> price;
int n, ans;

int getMax(int x, int y)
{
	if (x < y)
		return y;
	else
		return x;
}

int solve(int day, int sum)
{
	int ret = 0;

	if (day == n)
	{
		if (ans < sum)
			ans = sum;

		return sum;
	}

	if (n < day)
	{
		return 0;
	}

	if (day + time[day] <= n)
	{
		ret = getMax(solve(day + time[day], sum + price[day]), ret);
	}

	ret = getMax(solve(day + 1, sum), ret);

	return ret;
}

int main()
{
	int t, p, sum = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> t >> p;
		sum += p;

		time.push_back(t);
		price.push_back(p);
	}

	cout << solve(0, 0) << endl;

	return 0;
}

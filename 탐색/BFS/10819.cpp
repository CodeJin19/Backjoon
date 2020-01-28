#include <iostream>
#include <vector>
#include <math.h>

using namespace std;

vector <int> list;
vector <int> origin;
vector <bool> check;

int ans = -1;
int n;

void mix(int idx)
{
	int x, sum = 0;

	if (idx == n)
	{
		for (int i = 0; i < n - 1; i++)
		{
			x = abs(list[i] - list[i + 1]);
			sum += x;
		}

		if (ans < sum)
		{
			ans = sum;
		}

	}

	for (int i = 0; i < n; i++)
	{
		if (!check[i])
		{
			list[idx] = origin[i];
			check[i] = true;

			mix(idx + 1);

			check[i] = false;
		}
	}
}

int main()
{
	int x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		origin.push_back(x);
		list.push_back(0);
		check.push_back(false);
	}

	mix(0);

	cout << ans << endl;

	return 0;
}

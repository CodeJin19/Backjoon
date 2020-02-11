#include <iostream>
#include <vector>

using namespace std;

vector <int> total;
vector <int> list;
vector <bool> cache;

void solve(int idx)
{
	if (idx == 6)
	{
		for (int i = 0; i < 6; i++)
		{
			cout << list[i] << " ";
		}
		cout << "\n";
		return;
	}

	for (int i = 0; i < total.size(); i++)
	{
		if (!cache[i] && (idx == 0 || (idx != 0 && list[idx - 1] < total[i])))
		{
			list[idx] = total[i];
			cache[i] = true;
			solve(idx + 1);
			cache[i] = false;
		}
	}

}

int main()
{
	int n, x;

	cin >> n;

	for (int i = 0; i < 6; i++)
	{
		list.push_back(0);
	}

	while (n != 0)
	{
		total.clear();
		cache.clear();

		for (int i = 0; i < n; i++)
		{
			cin >> x;
			total.push_back(x);
			cache.push_back(false);
		}

		for (int i = 0; i < 6; i++)
		{
			list[i] = 0;
		}

		solve(0);
        cout << "\n";

		cin >> n;
	}
	
	return 0;
}

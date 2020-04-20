#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> cow;
	int n, s, x, cnt = 0;

	cin >> n >> s;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		cow.push_back(x);
	}

	for (int i = 0; i < n - 1; i++)
		for (int j = i + 1; j < n; j++)
			if (cow[i] + cow[j] <= s)
				cnt++;

	cout << cnt << endl;

	return 0;
}

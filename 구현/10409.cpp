#include <iostream>

using namespace std;

int main()
{
	int n, t, x;
	int cnt = 0;

	cin >> n >> t;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		if (x <= t)
		{
			cnt++;
			t -= x;
		}
		else
		{
			t = 0;
		}
	}

	cout << cnt << endl;

	return 0;
}

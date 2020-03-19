#include <iostream>

using namespace std;

int main()
{
	int w, n, p, h, cnt = 0;

	cin >> w >> n >> p;

	for (int i = 0; i < p; i++)
	{
		cin >> h;

		if (w <= h && h <= n)
			cnt++;
	}

	cout << cnt << endl;

	return 0;
}

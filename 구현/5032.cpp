#include <iostream>

using namespace std;

int main()
{
	int e, f, c, now, r;
	int cnt = 0;

	cin >> e >> f >> c;

	now = e + f;

	while (c <= now)
	{
		cnt += (now / c);
		r = now % c;
		now /= c;
		now += r;
	}

	cout << cnt << endl;

	return 0;
}

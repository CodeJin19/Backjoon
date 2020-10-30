#include <iostream>

using namespace std;

int main()
{
	int n, x, ans, y, m;

	cin >> n;

	y = 0;
	m = 0;

	for (int itr = 0; itr < n; ++itr)
	{
		cin >> x;

		ans = x / 30;
		ans++;
		ans *= 10;
		y += ans;

		ans = x / 60;
		ans++;
		ans *= 15;
		m += ans;
	}

	if (m < y)
	{
		cout << "M " << m << endl;
	}
	else if (y < m)
	{
		cout << "Y " << y << endl;
	}
	else
	{
		cout << "Y M " << y << endl;
	}

	return 0;
}

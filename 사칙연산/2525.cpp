#include <iostream>

using namespace std;

int main()
{
	int h, m, n, x;

	cin >> h >> m >> n;

	if (n < 60)
	{
		m += n;	
	}
	else
	{
		x = n / 60;
		h += x;

		n %= 60;
		m += n;
	}

	if (60 <= m)
	{
		h++;
		m %= 60;
	}

	if (24 <= h)
	{
		h %= 24;
	}

	cout << h << " " << m << endl;

	return 0;
}

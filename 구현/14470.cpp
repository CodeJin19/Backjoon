#include <iostream>

using namespace std;

int main()
{
	int a, b, c, d, e, t;

	cin >> a >> b >> c >> d >> e;

	if (a < 0)
	{
		t = -1;
		t *= a;
		t *= c;
		t += d;
	}
	else
	{
		t = 0;
		b -= a;
	}
	
	t += (b * e);
	
	cout << t << endl;
	
	return 0;
}

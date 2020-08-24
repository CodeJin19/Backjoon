#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int a, b, c;
	double ans;

	cin >> a >> b >> c;

	ans = (a + 1) * (b + 1);
	ans /= (c + 1);
	ans--;

	ans = floor(ans);

	cout << (int)ans << endl;

	return 0;
}

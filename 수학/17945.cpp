#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int a, b, d;

	cin >> a >> b;

	d = sqrt(a * a - b);
    
	if (d == 0)
		cout << -a << "\n";
	else
		cout << -a - d << " " << -a + d << "\n";

	return 0;
}

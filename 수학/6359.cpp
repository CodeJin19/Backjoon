#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int t, n, x;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		x = sqrt(n);

		cout << x << "\n";
	}
    
	return 0;
}

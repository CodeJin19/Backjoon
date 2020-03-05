#include <iostream>

using namespace std;

int main()
{
	int n, x;

	cin >> n >> x;

	while (x != 0)
	{
		if (x % n == 0)
			cout << x << " is a multiple of " << n << ".\n";
		else
			cout << x << " is NOT a multiple of " << n << ".\n";
        
		cin >> x;
	}

	return 0;
}

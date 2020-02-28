#include <iostream>
using namespace std;

int main()
{
	int k, n, m;
	
	cin >> k >> n >> m;

	if (k * n <= m)
		cout << "0\n";
	else
		cout << k * n - m << "\n";

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int t, n, m, healthy, unhealthy;

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		cin >> n >> m;

		unhealthy = m * 2 - n;
		healthy = m - unhealthy;

		cout << unhealthy << " " << healthy << "\n";
	}

	return 0;
}

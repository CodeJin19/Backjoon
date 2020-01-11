#include <iostream>

using namespace std;

int main()
{
	int n, sum = 0;
	char x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		sum += (x - 'A') + 1;
	}

	cout << sum << endl;

	return 0;
}

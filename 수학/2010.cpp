#include <iostream>

using namespace std;

int main()
{
	int n, x;
	int sum = 1;

	cin >> n;
	
	for (int i = 0; i < n; i++)
	{
		cin >> x;

		sum += (x - 1);
	}
	
	cout << sum << endl;

	return 0;
}

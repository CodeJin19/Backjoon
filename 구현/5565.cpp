#include <iostream>

using namespace std;

int main()
{
	int sum, x;

	cin >> sum;

	for (int i = 0; i < 9; i++)
	{
		cin >> x;
		sum -= x;
	}

	cout << sum << endl;
	
	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int n;

	cin >> n;

	for (int i = 1; i < n; i++)
	{
		cout << " ";
	}
	cout << "*\n";

	for (int i = 1; i < n; i++)
	{
		for (int j = 0; j < n - i - 1; j++)
		{
			cout << " ";
		}
		cout << "*";

		for (int j = 0; j < 2 * i - 1; j++)
		{
			cout << " ";
		}
		cout << "*\n";
	}

	return 0;
}

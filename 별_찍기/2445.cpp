#include <iostream>

using namespace std;

int main()
{
	int n;

	cin >> n;

	for (int i = 1; i < n; i++)
	{
		for (int j = 0; j < i; j++)
		{
			cout << "*";
		}

		for (int j = 0; j < 2 * (n - i); j++)
		{
			cout << " ";
		}

		for (int j = 0; j < i; j++)
		{
			cout << "*";
		}
		cout << "\n";
	}

	for (int i = 0; i < 2 * n; i++)
	{
		cout << "*";
	}
	cout << "\n";

	for (int i = n - 1; 0 < i; i--)
	{
		for (int j = 0; j < i; j++)
		{
			cout << "*";
		}

		for (int j = 0; j < 2 * (n - i); j++)
		{
			cout << " ";
		}

		for (int j = 0; j < i; j++)
		{
			cout << "*";
		}
		cout << "\n";
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int num[6] = { 1, 1, 2, 2, 2, 8 };
	int x;

	for (int i = 0; i < 6; i++)
	{
		cin >> x;

		cout << num[i] - x << " ";
	}

	cout << endl;

	return 0;
}

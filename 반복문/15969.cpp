#include <iostream>

using namespace std;

int main()
{
	int n, x;
	int max = -1;
	int min = 1234;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		if (x < min)
		{
			min = x;
		}
		if (max < x)
		{
			max = x;
		}
	}
	
	cout << max - min << endl;

	return 0;
}

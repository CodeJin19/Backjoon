#include <iostream>

using namespace std;

int main()
{
	int n, a, b;
	int sum = 0;

	cin >> n;

	for (int i = 1; i <= n; i++)
	{
		cin >> b;
		a = b * i;
		a -= sum;
		cout << a << " ";
		sum += a;
	}
	cout << endl;

	return 0;
}

#include <iostream>
#include <math.h>

using namespace std;

void hanoi(int n, int from, int to, int tmp)
{
	if (n == 1)
	{
		cout << from << " " << to << "\n";
	}
	else
	{
		hanoi(n - 1, from, tmp, to);
		cout << from << " " << to << "\n";
		hanoi(n - 1, tmp, to, from);
	}
}

int main()
{
	int num;

	cin >> num;

	cout << fixed;
	cout.precision(0);
	cout << pow(2, num) - 1 << "\n";
	hanoi(num, 1, 3, 2);

	return 0;
}

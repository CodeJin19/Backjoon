#include <iostream>

using namespace std;

int main()
{
	int a, b, n, v;

	cin >> a >> b >> v;

	n = v - b;
	n /= (a - b);

	if ((v - b) % (a - b) != 0)
	{
		n++;
	}

	cout << n << endl;

	return 0;
}

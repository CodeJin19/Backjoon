#include <iostream>

using namespace std;

int main()
{
	int n, next, cnt = 0;

	cin >> n;

	while (10 <= n)
	{
		next = 1;

		while (n != 0)
		{
			next *= (n % 10);
			n /= 10;
		}

		n = next;
		cnt++;
	}

	cout << cnt << endl;

	return 0;
}

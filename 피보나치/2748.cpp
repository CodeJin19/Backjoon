#include <iostream>

using namespace std;

int main()
{
	int n, idx;
	long long fib[100];

	cin >> n;

	fib[0] = 0;
	fib[1] = 1;
	idx = 1;

	while (idx < n)
	{
		fib[idx + 1] = fib[idx] + fib[idx - 1];
		idx++;
	}

	cout << fib[n] << endl;

	return 0;
}

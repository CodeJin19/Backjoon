#include <iostream>

using namespace std;

int main()
{
	int T, s, n, q, p, sum;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> s >> n;

		sum = s;

		for (int i = 0; i < n; i++)
		{
			cin >> q >> p;

			sum += (p * q);
		}

		cout << sum << endl;
	}
	return 0;
}

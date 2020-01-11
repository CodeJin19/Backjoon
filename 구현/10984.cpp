#include <iostream>

using namespace std;

int main()
{
	int t, n, x, tot, sum;
	double score, ans;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;
		sum = 0;
		ans = 0;

		for (int i = 0; i < n; i++)
		{
			cin >> x >> score;
			sum += x;
			ans += (score * x);
		}
		ans /= sum;

		cout << sum << " ";
		cout << fixed;
		cout.precision(1);
		cout << ans << endl;
	}

	return 0;
}

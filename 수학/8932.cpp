#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int t, ans;
	double x, score, sum;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		ans = 0;

		cin >> x;

		score = 26.7 - x;
		score = pow(score, 1.835);
		score *= 9.23076;
		ans += score;

		cin >> x;

		score = x - 75;
		score = pow(score, 1.348);
		score *= 1.84523;
		ans += score;

		cin >> x;

		score = x - 1.5;
		score = pow(score, 1.05);
		score *= 56.0211;
		ans += score;

		cin >> x;

		score = 42.5 - x;
		score = pow(score, 1.81);
		score *= 4.99087;
		ans += score;

		cin >> x;

		score = x - 210;
		score = pow(score, 1.41);
		score *= 0.188807;
		ans += score;

		cin >> x;

		score = x - 3.8;
		score = pow(score, 1.04);
		score *= 15.9803;
		ans += score;

		cin >> x;

		score = 254 - x;
		score = pow(score, 1.88);
		score *= 0.11193;
		ans += score;

		cout << ans << endl;
	}

	return 0;
}

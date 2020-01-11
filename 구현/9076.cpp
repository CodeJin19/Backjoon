#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int t, max, min, x;
	vector <int> score;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		score.clear();

		for (int i = 0; i < 5; i++)
		{
			cin >> x;
			score.push_back(x);
		}

		sort(score.begin(), score.end());

		if (4 <= score[3] - score[1])
		{
			cout << "KIN\n";
		}
		else
		{
			cout << score[1] + score[2] + score[3] << "\n";
		}
	}

	return 0;
}

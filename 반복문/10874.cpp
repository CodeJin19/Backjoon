#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> ans;
	int x, n, score;

	for (int i = 1; i <= 10; i++)
	{
		x = (i - 1) % 5;
		x++;
		ans.push_back(x);
	}

	cin >> n;

	for (int i = 1; i <= n; i++)
	{
		score = 0;

		for (int j = 0; j < 10; j++)
		{
			cin >> x;

			if (x == ans[j])
			{
				score++;
			}
		}

		if (score == 10)
		{
			cout << i << endl;
		}
	}

	return 0;
}

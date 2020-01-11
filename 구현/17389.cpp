#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n, sum = 0, score = 0, bonus = 0;
	string s;

	cin >> n >> s;

	for (int i = 0; i < n; i++)
	{
		score++;

		if (s[i] == 'O')
		{
			sum += score;
			sum += bonus;
			bonus++;
		}
		else
		{
			bonus = 0;
		}
	}

	cout << sum << endl;

	return 0;
}

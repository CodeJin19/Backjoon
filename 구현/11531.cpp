#include <iostream>
#include <string>

using namespace std;

int main()
{
	int penalty[30] = { 0, };
	int m, score = 0, cnt = 0;
	char p;
	string r;

	cin >> m;

	while (m != -1)
	{
		cin >> p >> r;

		if (r[0] == 'r')
		{
			score += (m + (penalty[(p - 'A')] * 20));
			cnt++;
		}
		else
		{
			penalty[(p - 'A')] += 1;
		}

		cin >> m;
	}

	cout << cnt << " " << score << endl;

	return 0;
}

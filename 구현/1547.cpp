#include <iostream>

using namespace std;

int main()
{
	int m, a, b;
	int ball = 1;

	cin >> m;

	for (int i = 0; i < m; i++)
	{
		cin >> a >> b;

		if (ball == a)
		{
			ball = b;
		}
		else if (ball == b)
		{
			ball = a;
		}
	}

	cout << ball << endl;

	return 0;
}

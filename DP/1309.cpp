#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> prev(3, 0);
	vector <int> now(3, 0);
	int n;

	prev[0] = 1;

	cin >> n;

	for (int i = 0; i <= n; i++)
	{
		now[0] = prev[0] + prev[1] + prev[2];
		now[1] = prev[0] + prev[2];
		now[2] = prev[0] + prev[1];

		for (int j = 0; j < 3; j++)
			prev[j] = now[j] % 9901;
	}

	cout << now[0] % 9901 << endl;

	return 0;
}

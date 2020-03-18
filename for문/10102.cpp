#include <iostream>

using namespace std;

int main()
{
	int n, cnt = 0;
	char x;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		if (x == 'A')
			cnt++;
		else
			cnt--;
	}

	if (cnt == 0)
		cout << "Tie\n";
	else if (0 < cnt)
		cout << "A\n";
	else
		cout << "B\n";

	return 0;
}

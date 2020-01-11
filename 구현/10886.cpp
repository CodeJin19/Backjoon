#include <iostream>

using namespace std;

int main()
{
	int n, x;
	int cnt = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		if (x == 0)
		{
			cnt--;
		}
		else
		{
			cnt++;
		}
	}

	if (0 < cnt)
	{
		cout << "Junhee is cute!\n";
	}
	else
	{
		cout << "Junhee is not cute!\n";
	}

	return 0;
}

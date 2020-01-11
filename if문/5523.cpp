#include <iostream>

using namespace std;

int main()
{
	int t, a, b, acnt = 0, bcnt = 0;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> a >> b;

		if (a < b)
		{
			bcnt++;
		}
		else if (b < a)
		{
			acnt++;
		}
	}

	cout << acnt << " " << bcnt << endl;

	return 0;
}

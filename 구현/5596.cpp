#include <iostream>

using namespace std;

int main()
{
	int n;
	int s = 0;
	int t = 0;

	for (int i = 0; i < 4; i++)
	{
		cin >> n;
		s += n;
	}

	for (int i = 0; i < 4; i++)
	{
		cin >> n;
		t += n;
	}

	if (s < t)
	{
		cout << t << endl;
	}
	else
	{
		cout << s << endl;
	}

	return 0;
}

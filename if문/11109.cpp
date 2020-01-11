#include <iostream>

using namespace std;

int main()
{
	int t, d, n, s, p;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> d >> n >> s >> p;
		
		p = p * n + d;
		s *= n;

		if (p == s)
		{
			cout << "does not matter\n";
		}
		else if (p < s)
		{
			cout << "parallelize\n";
		}
		else
		{
			cout << "do not parallelize\n";
		}
	}

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int t, m, x;
	char s;

	cin >> t;
	
	for (int itr = 0; itr < t; itr++)
	{
		cin >> m >> s;

		if (s == 'C')
		{
			for (int i = 0; i < m; i++)
			{
				cin >> s;

				x = s - 'A';

				cout << x + 1 << " ";
			}
			cout << endl;
		}
		else
		{
			for (int i = 0; i < m; i++)
			{
				cin >> x;
				
				cout << (char)(--x + 'A') << " ";
			}
			cout << endl;
		}
	}

	return 0;
}

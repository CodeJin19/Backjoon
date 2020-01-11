#include <iostream>

using namespace std;

int main()
{
	int n, cnt;
	int long long a, b, c;
    
	cin >> n;

	if (n <= 2)
	{
		cout << 1 << endl;
	}
	else
	{
		a = 1;
		b = 1;
		c = a + b;
		cnt = 3;

		while (cnt < n)
		{
			a = b;
			b = c;
			c = a + b;
			cnt++;
		}

        cout << fixed;
        cout.precision(0);
		cout << c << endl;
	}

	return 0;
}

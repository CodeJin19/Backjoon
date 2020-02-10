#include <iostream>
#include <math.h>

using namespace std;

int find(int x)
{
	int sum = x;

	while (x != 0)
	{
		sum += (x % 10);
		x /= 10;
	}

	return sum;
}

int main()
{
	int n, idx, d, x, min = 2100000000;

	cin >> n;

	d = (int) log10(n);
	d++;
	d *= 10;

	idx = n;

	while (1 <= idx && n - d <= idx)
	{
		x = find(idx);

		if (x == n && idx < min)
		{
			min = idx;
		}

		idx--;
	}

    if (min == 2100000000)
    {
        cout << "0\n";
    }
    else
    {
        cout << min << endl;
    }
	
	return 0;
}

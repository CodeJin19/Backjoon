#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, m, x, l, h, prev, now;
	int max = 0;
	double sum = 0;

	vector <int> arr;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		arr.push_back(x);

		if (max < x)
		{
			max = x;
		}
	}

	l = 0;
	h = max;
    now = -1;

	while (sum != m)
	{
		x = h + l;
		x /= 2;
        prev = now;
        now = x;

		sum = 0;

		for (int i = 0; i < arr.size(); i++)
		{
			if (x < arr[i])
			{
				sum += (arr[i] - x);
			}
		}
        
        if (prev == now)
        {
           break; 
        }
		else if (m < sum)
		{
			l = x;
		}
		else if (sum < m)
		{
			h = x;
		}
	}

	cout << x << endl;

	return 0;
}

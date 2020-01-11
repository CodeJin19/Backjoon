#include <iostream>
#include <vector>

using namespace std;

vector <int> wine;
vector <vector <int>> cache;

int solve(int present, int con)
{
	int x, y, z;

	if (wine.size() - 1 <= present)
	{
		return cache[con - 1][present];
	}
	
	if (cache[con - 1][present] != -1)
	{
		return cache[con - 1][present];
	}
	else
	{
		if (con == 1)
		{
			x = solve(present + 1, con + 1) + wine[present];
			y = solve(present + 2, 1) + wine[present];
            z = solve(present + 3, 1) + wine[present];

			if (x < y)
			{
				if(y < z)
                {
                    cache[con - 1][present] = z;
                }
                else
                {
                    cache[con - 1][present] = y;
                }
			}
			else
			{
                if(x < z)
                {
                    cache[con - 1][present] = z;
                }
                else
                {
				    cache[con - 1][present] = x;
                }
			}
		}
		else
		{
            x = solve(present + 2, 1) + wine[present];
            y = solve(present + 3, 1) + wine[present];
            
            if(x < y)
            {
                cache[con - 1][present] = y;
            }
            else
            {
                cache[con - 1][present] = x;
            }
		}

		return cache[con - 1][present];
	}

}

int main()
{
	int n, x;
	int max = -1;
	vector <int> tmp;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		wine.push_back(x);
		tmp.push_back(-1);
	}

	tmp.push_back(-1);

	cache.push_back(tmp);
	cache.push_back(tmp);

	cache[0][n - 1] = wine[n - 1];
	cache[1][n - 1] = wine[n - 1];

	cache[0][n] = 0;
	cache[1][n] = 0;

	for (int i = n - 1; 0 <= i; i--)
	{
		x = solve(i, 1);

		if (max < x)
		{
			max = x;
		}
	}
    
    cout << max << endl;

	return 0;
}

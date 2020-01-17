#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> line;
	int n, q, x, y, sum = 0;

	cin >> n >> q;

	for (int i = 0; i <= n; i++)
	{
		line.push_back(1);
	}

	for (int t = 0; t < q; t++)
	{
		cin >> x >> y;

		while (x <= n)
		{
			line[x] = 0;
			x += y;
		}
	}

	for(int i = 1; i <= n; i++)
	{
		sum += line[i];
	}
	
	cout << sum << endl;

	return 0;
}

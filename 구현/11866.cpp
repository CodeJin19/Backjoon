#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, k, cnt, idx;
	vector <bool> circle;

	cin >> n >> k;

	for (int i = 0; i <= n; i++)
	{
		circle.push_back(true);
	}

	cout << "<" << k;

	circle[k] = false;
	idx = k;

	for (int i = 0; i < n - 1; i++)
	{
		cnt = 0;

		while (cnt != k)
		{
			idx++;

			if (n < idx)
			{
				idx = 1;
			}

			if (circle[idx])
			{
				cnt++;
			}
		}

		cout << ", " << idx;
		circle[idx] = false;
	}

	cout << ">\n";
    
	return 0;
}

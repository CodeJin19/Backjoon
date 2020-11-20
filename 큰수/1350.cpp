#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> size;
	unsigned long long cl, ans, r, x;
	int n, num;

	cin >> n;

	ans = 0;

	for (int i = 0; i < n; i++)
	{
		cin >> num;
		size.push_back(num);
	}

	cin >> cl;

	for (int i = 0; i < n; i++)
	{
		num = size[i];

		if (cl <= num)
		{
			x = num / cl;
			r = num % cl;

			if (r != 0)
			{
				ans++;
			}

			ans += x;
		}
		else if (num != 0)
		{
			ans++;
		}
	}

	ans *= cl;

	cout << ans << endl;

	return 0;
}

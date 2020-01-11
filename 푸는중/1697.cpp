#include <iostream>
#include <vector>
#include <string>
#include <math.h>
#include <algorithm>
#include <queue>

using namespace std;

int main()
{
	int n, k, now, ret, x, min = 2100000000;
	queue <int> position;
	queue <int> cnt;

	cin >> n >> k;

	position.push(n);
	cnt.push(0);

	while (!position.empty())
	{
		now = position.front();
		ret = cnt.front();

		cout << now << endl;
		cin >> x;

		position.pop();
		cnt.pop();

		if (now == k && ret < min)
		{
			min = ret;
		}

		if (ret <= min)
		{
			if (n < k)
			{
				position.push(now * 2);
				cnt.push(ret + 1);
			}

			if (0 <= now - 1)
			{
				position.push(now - 1);
				cnt.push(ret + 1);
			}

			if (now + 1 <= 100000)
			{
				position.push(now + 1);
				cnt.push(ret + 1);
			}
		}
	}

	cout << min << endl;


	return 0;
}

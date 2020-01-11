#include <iostream>
#include <vector>

using namespace std;

int main()
{
	bool flag;
	int t, p, m, cnt, x;
	vector <int> seat;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> p >> m;

		cnt = 0;
		seat.clear();

		for (int i = 0; i < p; i++)
		{
			cin >> x;

			flag = true;

			for (int i = 0; i < seat.size(); i++)
			{
				if (x == seat[i])
				{
					flag = false;
					break;
				}
			}

			if (flag)
			{
				seat.push_back(x);
			}
			else
			{
				cnt++;
			}
		}

		cout << cnt << endl;
	}

	return 0;
}

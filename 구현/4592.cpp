#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> ans;
	int num, prev, x;

	cin >> num;

	while (num != 0)
	{
		ans.clear();
		prev = 0;

		for (int i = 0; i < num; i++)
		{
			cin >> x;

			if (prev != x)
			{
				prev = x;
				ans.push_back(x);
			}
		}

		for (int i = 0; i < ans.size(); i++)
		{
			cout << ans[i] << " ";
		}
		cout << "$\n";

		cin >> num;
	}

	return 0;
}

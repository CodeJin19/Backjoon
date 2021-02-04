#include <iostream>
#include <vector>
#include <stack>
#include <utility>

using namespace std;

int main()
{
	stack <pair<int, int>> stck;
	vector <int> ans;
	int n, x, cur = 0;

	cin >> n;

	cin >> x;
	stck.push(make_pair(x, 1));

	ans.push_back(0);

	for (int i = 2; i <= n; i++)
	{
		cin >> x;

		if (stck.top().first < x)
		{
			while (!stck.empty() && stck.top().first < x)
				stck.pop();

			if (stck.empty())
				ans.push_back(0);
			else
				ans.push_back(stck.top().second);

			stck.push(make_pair(x, i));
		}
		else
		{
			ans.push_back(stck.top().second);
			stck.push(make_pair(x, i));
		}
	}

	for (int i = 0; i < n; i++)
		cout << ans[i] << " ";
	cout << endl;
    
	return 0;
}

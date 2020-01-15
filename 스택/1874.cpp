#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <string> ans;
	vector <int> stack;
	vector <int> arr;
	int n, x, max = 1;
	bool flag = false;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr.push_back(x);
	}

	for (int i = 0; i < n; i++)
	{
		x = arr[i];

		if (flag)
		{
			break;
		}
		else if (stack.empty())
		{
			for (int j = max; j <= x; j++)
			{
				stack.push_back(j);
				ans.push_back("+");
			}

			max = x + 1;
			stack.pop_back();
			ans.push_back("-");
		}
		else
		{
			if (x == stack.back())
			{
				stack.pop_back();
				ans.push_back("-");
			}
			else if (stack.back() < x)
			{
				for (int j = max; j <= x; j++)
				{
					stack.push_back(j);
					ans.push_back("+");
				}

				max = x + 1;
				stack.pop_back();
				ans.push_back("-");
			}
			else
			{
				flag = true;
				ans.clear();
				ans.push_back("NO");
			}
		}
	}

	for (int i = 0; i < ans.size(); i++)
	{
		cout << ans[i] << "\n";
	}

	return 0;
}

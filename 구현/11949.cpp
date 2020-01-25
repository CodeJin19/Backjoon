#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> arr;
	int n, m, x, tmp;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		arr.push_back(x);
	}

	for (int i = 1; i <= m; i++)
	{
		for (int j = 0; j < n - 1; j++)
		{
			if (arr[j + 1] % i < arr[j] % i )
			{
				tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
			}
		}
	}

	for (int i = 0; i < n; i ++)
	{
		cout << arr[i] << "\n";
	}

	return 0;
}

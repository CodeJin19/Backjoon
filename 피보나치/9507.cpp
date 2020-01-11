#include <iostream>
#include <vector>

using namespace std;

vector <int long long> arr;

int main()
{
	int t, n;
	
	cin >> t;

	arr.push_back(1);
	arr.push_back(1);
	arr.push_back(2);
	arr.push_back(4);

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		if (n < arr.size())
		{
			cout << arr[n] << "\n";
		}
		else
		{
			for (int i = arr.size(); i <= n; i++)
			{
				arr.push_back(arr[i - 1] + arr[i - 2] + arr[i - 3] + arr[i - 4]);
			}

			cout << arr[n] << "\n";
		}
	}

	return 0;
}

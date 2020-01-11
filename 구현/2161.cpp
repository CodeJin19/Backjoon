#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> arr;
	int n, cnt;
	int idx = 0;
	int flag = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		arr.push_back(i + 1);
	}

	cout << arr[idx] << " ";
	arr[idx] = 0;
	flag++;

	while (flag != n)
	{
		cnt = 0;

		while (cnt != 2)
		{
			idx++;

			if (n <= idx)
			{
				idx -= n;
			}

			if (arr[idx] != 0)
			{
				cnt++;
			}
		}

		cout << arr[idx] << " ";
		arr[idx] = 0;
		flag++;
	}

	cout << endl;
    
	return 0;
}

#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int t, n, r, l;
	vector <int> arr;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		arr.clear();

		cin >> n;

		while (n != 0)
		{
			r = n % 2;
			arr.push_back(r);
			n /= 2;
		}

		l = arr.size();

		for (int i = 0; i < l; i++)
			if (arr[i] == 1)
				cout << i << " ";

		cout << "\n";
	}

	return 0;
}

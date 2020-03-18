#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, cnt, idx;

	cin >> n;

	vector <int> list(n, 0);
	vector <int> log(n, 0);

	for (int i = 0; i < n; i++)
		cin >> log[i];

	for (int i = n - 1; 0 < i; i--)
	{
		cnt = 0;
		idx = n - 1;

		if (log[i] != 0)
		{
			do
			{
				if (list[idx] == 0)
					cnt++;

				idx--;
			} while (cnt != log[i]);
		}

		if (list[idx] != 0)
			while (list[idx] != 0)
				idx--;

		list[idx] = i + 1;
		
	}

	idx = n - 1;

	while (list[idx] != 0)
		idx--;

	list[idx] = 1;

	for (int i = 0; i < n; i++)
		cout << list[i] << " ";
	cout << endl;

	return 0;
}

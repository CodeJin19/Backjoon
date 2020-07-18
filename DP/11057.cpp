#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, sum = 0;
	vector <int> prev;
	vector <int> now;

	cin >> n;

	for (int i = 0; i < 10; i++)
	{
		prev.push_back(1);
		now.push_back(0);
	}		

	for (int i = 1; i < n; i++)
	{
		for (int j = 0; j < 10; j++)
			for (int k = j; k < 10; k++)
				now[k] += prev[j];

		for (int j = 0; j < 10; j++)
		{
			prev[j] = now[j] % 10007;
			now[j] = 0;
		}
	}

	for (int i = 0; i < 10; i++)
		sum += prev[i];

	cout << sum % 10007 << endl;

	return 0;
}

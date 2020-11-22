#include <iostream>
#include <vector>
using namespace std;

int main()
{
	vector <int> time;
	int n, q, x;

	cin >> n >> q;

	for (int i = 1; i <= n; i++)
	{
		cin >> x;
		
		for (int j = 0; j < x; j++)
		{
			time.push_back(i);
		}
	}

	for (int i = 0; i < q; i++)
	{
		cin >> x;

		cout << time[x] << "\n";
	}

	return 0;
}

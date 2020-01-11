#include <iostream>

using namespace std;

int main()
{
	int num, idx;
	int max = 0;

	for (int i = 0; i < 9; i++)
	{
		cin >> num;

		if (max < num)
		{
			max = num;
			idx = i + 1;
		}
	}

	cout << max << endl << idx << endl;

	return 0;
}

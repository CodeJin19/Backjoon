#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector <int> tot1, tot2;
	int l1, l2, idx;
	unsigned int ans = 0, tmp;
	string num1, num2;

	cin >> num1 >> num2;

	l1 = num1.length();
	l2 = num2.length();

	for (int i = 0; i < 10; ++i)
	{
		tot1.push_back(0);
		tot2.push_back(0);
	}

	for (int i = 0; i < l1; ++i)
	{
		idx = (int)(num1[i] - '0');
		tot1[idx] += 1;
	}

	for (int i = 0; i < l2; ++i)
	{
		idx = (int)(num2[i] - '0');
		tot2[idx] += 1;
	}

	for (int i = 0; i < 10; ++i)
	{
		for (int j = 0; j < 10; ++j)
		{
			if (i != 0 && j != 0)
			{
				tmp = tot1[i] * tot2[j];
				tmp *= i;
				tmp *= j;
				ans += tmp;
			}
		}
	}

	cout << ans << endl;

	return 0;
}

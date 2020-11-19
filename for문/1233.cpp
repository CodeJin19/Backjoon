#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> cnt;
	int s1, s2, s3, max, idx;

	cin >> s1 >> s2 >> s3;

	for (int i = 0; i <= s1 + s2 + s3; ++i)
	{
		cnt.push_back(0);
	}

	max = 0;
	idx = -1;

	for (int i = 1; i <= s1; ++i)
	{
		for (int j = 1; j <= s2; ++j)
		{
			for (int k = 1; k <= s3; ++k)
			{
				cnt[i + j + k] += 1;

				if (max < cnt[i + j + k])
				{
					max = cnt[i + j + k];
				}
			}
		}
	}

	for (int i = 0; i <= s1 + s2 + s3; ++i)
	{
		if (cnt[i] == max)
		{
			cout << i << endl;
			break;
		}
	}

	return 0;
}

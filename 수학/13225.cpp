#include <iostream>
#include <vector>

using namespace std;

vector <int> prime;

int solve(int num)
{
	vector <int> tmp;
	int cnt, idx, ret = 1;

	while (num != 1)
	{
		idx = 0;

		while (idx < prime.size() && prime[idx] <= num)
		{
			cnt = 0;

			while (num % prime[idx] == 0)
			{
				cnt++;
				num /= prime[idx];
			}

			if (cnt != 0)
			{
				tmp.push_back(cnt);
			}

			idx++;
		}
	}

	for (int i = 0; i < tmp.size(); i++)
	{
		ret *= (tmp[i] + 1);
	}

	return ret;
}

int main()
{
	int arr[10000];
	int t, idx, num;

	cin >> t;

	for (int i = 0; i < 10000; i++)
	{
		arr[i] = 1;
	}

	for (int i = 2; i < 10000; i++)
	{
		if (arr[i] == 1)
		{
			idx = i + i;

			while (idx < 10000)
			{
				arr[idx] = 0;
				idx += i;
			}

			prime.push_back(i);
		}
	}

	for (int itr = 0; itr < t; itr++)
	{
		cin >> num;

		if (num == 1)
		{
			cout << "1 1\n";
		}
		else
		{
			cout << num << " " << solve(num) << "\n";
		}
	}
	
	return 0;
}

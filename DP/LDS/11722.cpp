#include <iostream>
#include <vector>

using namespace std;

vector <int> arr;
int cache[1000];

int max(int x, int y)
{
	if (x < y)
	{
		return y;
	}
	else
	{
		return x;
	}
}

int list(int start)  //start부터 시작하는 가장 긴 감소순열의 길이
{
	int& ret = cache[start];

	if (ret != -1)
	{
		return ret;
	}

	ret = 1;

	for (int i = start + 1; i < arr.size(); i++)
	{
		if (arr[i] < arr[start])
		{
			ret = max(ret, list(i) + 1);
		}
	}

	return ret;
}

int main()
{
	int n, x;
	int max = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr.push_back(x);
		cache[i] = -1;
	}

	for (int i = 0; i < arr.size(); i++)
	{
		x = list(i);  //순열의 모든 위치에서 가장 긴 감소순열 검색

		if (max < x)
		{
			max = x;
		}
	}

	cout << max << endl;

	return 0;
}

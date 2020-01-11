#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <int> arr;
vector <int> cache;

int list(int start)  //start부터 시작하는 증가순열의 길이
{
	int & ret = cache[start];

	if (cache[start] != -1)
	{
		return ret;
	}

	ret = 1;

	for (int i = start + 1; i < arr.size(); i++)
	{
		if (arr[start] < arr[i])
		{
			ret = max(ret, list(i) + 1);
		}
	}

	return ret;
}

int main()
{
	int n, x;
	int max = -1;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr.push_back(x);
		cache.push_back(-1);
	}

	for (int i = 0; i < arr.size(); i++)  //배열의 각 위치에서 가장 긴 증가순열 반복검색
	{
		x = list(i);

		if (max < x)
		{
			max = x;
		}
	}

	cout << max << endl;

	return 0;
}

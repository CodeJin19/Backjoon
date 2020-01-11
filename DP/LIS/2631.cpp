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

int list(int start)
{
	int& ret = cache[start];

	if (ret != -1)
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
	int max = 0;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		arr.push_back(x);
		cache[i] = -1;
	}

	for (int i = 0; i < arr.size(); i++)  //LDS의 시작점을 i는 0부터 arr.size()까지 
	{
		x = list(i);

		if (max < x)
		{
			max = x;
		}
	}

	cout << n - max << endl;
    
	return 0;
}

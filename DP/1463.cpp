#include <iostream>
#include <vector>

using namespace std;

vector <int> cache;  //캐시

int min3(int a, int b, int c)  //세 정수 중 가장 작은 값 찾기
{
	if (b < c)
	{
		if (a < b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	else
	{
		if (a < c)
		{
			return a;
		}
		else
		{
			return c;
		}
	}
}

int min2(int a, int b)  //두 정수 중 가장 작은 값 찾기
{
	if (a < b)
	{
		return a;
	}
	else
	{
		return b;
	}
}

void solve(int n)
{
	int x;

	for (int i = cache.size(); i <= n; i++)  //bottom up 방식으로 진행
	{
		if (i % 6 == 0)  //i가 6의 배수이면, i/3, i/2, i-1 중 가장 작은 값으로 캐시에 넣기
		{
			x = min3(cache[i / 3], cache[i / 2], cache[i - 1]) + 1;
		}
		else if (i % 3 == 0)  //i가 3의 배수이면, i/3, i-1 중 가장 작은 값으로 캐시에 넣기
		{
			x = min2(cache[i / 3], cache[i - 1]) + 1;
		}
		else if (i % 2 == 0)  //i가 2의 배수이면, i/2, i-1 중 가장 작은 값으로 캐시에 넣기
		{
			x = min2(cache[i / 2], cache[i - 1]) + 1;
		}
		else  //그 외는 i-1의 값으로 캐시에 넣기
		{
			x = cache[i - 1] + 1;
		}

		cache.push_back(x);
	}
}

int main()
{
	int n, idx, min;

	cin >> n;

	//기본값 입력
	cache.push_back(0);
	cache.push_back(0);
	cache.push_back(1);
	cache.push_back(1);

	if (3 < n)
	{
		solve(n);
	}

	cout << cache[n] << endl;

	return 0;
}

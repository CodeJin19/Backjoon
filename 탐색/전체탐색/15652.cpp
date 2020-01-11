#include <iostream>
#include <vector>

using namespace std;

vector <int> arr;
int n, m;

void search(int now)
{
	if (now == m + 1)  //수열을 다 채운 경우 출력 후 리턴
	{
		for (int i = 1; i < arr.size(); i++)
		{
			cout << arr[i] << " ";
		}
		cout << "\n";
		return;
	}

	for (int i = arr[now - 1]; i <= n; i++)  //현위치의 숫자는 전 숫자보다 같거나 커야한다
	{
		arr[now] = i;
		search(now + 1);
	}
}

int main()
{
	cin >> n >> m;

	arr.push_back(1);
	for (int i = 0; i < m; i++)
	{
		arr.push_back(0);
	}

	search(1);

	return 0;
}

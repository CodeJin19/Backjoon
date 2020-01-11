#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> a, b;
	int n, x;
	int sum = 0;

	cin >> n;

	for (int i = 0; i < n; i++)  //배열A 입력
	{
		cin >> x;
		a.push_back(x);
	}

	for (int i = 0; i < n; i++)  //배열B 입력
	{
		cin >> x;
		b.push_back(x);
	}

	sort(a.begin(), a.end());  //배열A 정렬
	sort(b.begin(), b.end());  //배열B 정렬

	for (int i = 0; i < n; i++)
	{
		sum += (a[i] * b[n - 1 - i]);  //A는 순차적으로, B는 역순으로 곱하기
	}

	cout << sum << endl;

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int n;
	int sum = 0;
	int arr[1010];

	cin >> n;

	for (int i = 0; i < n; i++)  //입력 받으면서 전체 사탕 갯수 구하기
	{
		cin >> arr[i];

		sum += arr[i];
	}

	sum /= 2;  //sum은 전체 사탕의 2배이므로 /2

	for (int i = 1; i < n - 1;)  //전체 사탕에서 1번학생을 제외한 학생들의 사탕 수 빼기
	{
		sum -= arr[i];
		i += 2;
	}

	cout << sum << "\n";

	for (int i = 0; i < n - 1; i++)
	{
		sum = arr[i] - sum;
		cout << sum << "\n";
	}

	cin >> n;

	return 0;
}

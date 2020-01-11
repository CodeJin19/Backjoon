#include <iostream>

using namespace std;

int main()
{
	int n, sum, idx;
	int arr[50000];

	cin >> n;

	while (n != -1)
	{
		idx = 0;
		sum = 0;

		for (int i = 1; i < n; i++)
		{
			if (n % i == 0)  //약수 더하기
			{
				sum += i;
				arr[idx] = i;
				idx++;
			}
			if(n < sum)  //약수의 합이 n보다 크면 break
			{
				break;
			}
		}

		if (sum == n)  //약수의 합이 n과 같다면 결과 출력
		{
			cout << n << " = ";

			for (int i = 0; i < idx - 1; i++)
			{
				cout << arr[i] << " + ";
			}
			cout << arr[idx - 1] << "\n";
		}
		else
		{
			cout << n << " is NOT perfect.\n";
		}

		cin >> n;
	}

	return 0;
}

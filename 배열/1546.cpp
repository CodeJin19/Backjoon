#include <iostream>

using namespace std;

int main()
{
	int n, num;
	int max = 0;
	double sum = 0;

	cin >> n;

	for (int i = 0; i < n; i++)  //점수를 입력받으면서 동시에 최댓값을 찾고, sum을 계산한다
	{
		cin >> num;

		sum += num;

		if (max < num)
		{
			max = num;
		}
	}

	sum *= 100;
	sum /= max;
	sum /= n;

	cout << fixed;
	cout.precision(2);
	cout << sum << endl;

	return 0;
}

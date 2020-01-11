#include <iostream>

using namespace std;

int main()
{
	int T;
	int n, sum, score, cnt;
	int arr[1010];
	double avg;

	cin >> T;

	for (int itr = 0; itr < T; itr++)
	{
		cin >> n;

		sum = 0;

		//평균 구하기
		for (int i = 0; i < n; i++)
		{
			cin >> score;
			
			arr[i] = score;
			sum += score;
		}

		avg = sum;
		avg /= n;
		cnt = 0;

		//평균과 비교
		for (int i = 0; i < n; i++)
		{
			if (avg < arr[i])
			{
				cnt++;
			}
		}

		avg = cnt;
		avg *= 100;
		avg /= n;

		cout << fixed;
		cout.precision(3);
		cout << avg << "%\n";
	}

	return 0;
}

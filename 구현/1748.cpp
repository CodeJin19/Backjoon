#include <iostream>

using namespace std;

int main()
{
	int n;
	int sum = 0;
	int limit = 10;
	int x = 1;

	cin >> n;

	if (n < 10)  //n이 한자리수라면, n자리 수이다
	{
		cout << n << endl;
	}
	else
	{
		while (limit <= n)
		{
			limit /= 10;
			sum += (x * 9 * limit);  //x자리의 경우, x자리 수들이 9 * limit만큼 있다
			limit *= 100;
			x++;
		}
        
		limit /= 10;
		sum += ((n - limit + 1) * x);

		cout << sum << endl;
	}

	return 0;
}

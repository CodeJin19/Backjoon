#include <iostream>

using namespace std;

int main()
{
	int t, n, x, idx, prev, cnt;
	char arr[30];

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;
		idx = 0;
		prev = 0;

		for (int i = 0; i < n; i++)  //P-Sequence로 입력받으면서 문자열 복원
		{
			cin >> x;

			for (int j = 0; j < x - prev; j++)
			{
				arr[idx] = '(';
				idx++;
			}

			arr[idx] = ')';
			idx++;
			prev = x;
		}

		arr[idx] = '\0';

		for (int i = 0; i < idx; i++)  //복원된 문자열로 W-Sequence 출력
		{
			if (arr[i] == ')')
			{
				cnt = 0;
				x = 0;

				while (arr[i - cnt] != '(')
				{
					cnt++;

					if (arr[i - cnt] == '0')
					{
						x++;
					}
				}

				cout << cnt - x << " ";
				arr[i - cnt] = '1';
				arr[i] = '0';
			}
		}
		cout << "\n";
	}

	return 0;
}

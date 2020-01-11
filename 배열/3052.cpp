#include <iostream>

using namespace std;

int main()
{
	int rem[10];
	int num, r;
	int idx = 0;
	bool flag;

	for (int i = 0; i < 10; i++)
	{
		cin >> num;

		r = num % 42;
		flag = true;

		for (int j = 0; j < idx; j++)  //rem배열에 중복값이 있는지 확인
		{
			if (rem[j] == r)
			{
				flag = false;
			}
		}

		if (flag)  //rem배열에 값이 없으면 새로 추가
		{
			rem[idx] = r;
			idx++;
		}
	}

	cout << idx << endl;

	return 0;
}

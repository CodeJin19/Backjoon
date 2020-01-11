#include <iostream>

using namespace std;

int main()
{
	int n;
	int cnt = 0;
	int drr[10010];
	int crr[10010];
	bool flag;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> drr[i] >> crr[i];
	}

	for (int i = 0; i < n; i++)  //n개의 콘도에 대해 검사
	{
		flag = true;

		for (int j = 0; j < n; j++)
		{
			if (i != j)  //i를 제외한 다른 모든 콘도와 
			{
				if (drr[j] < drr[i] && crr[j] <= crr[i])
				{
					flag = false;
					j = n;
				}
				else if (crr[j] < crr[i] && drr[j] <= drr[i])
				{
					flag = false;
					j = n;
				}
			}
		}

		if (flag)
		{
			cnt++;
		}
	}

	cout << cnt << endl;

	return 0;
}

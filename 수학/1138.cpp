#include <iostream>

using namespace std;

int main()
{
	int n, idx, cnt;
	int order[15];
	int line[15];

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> order[i];
		line[i] = 0;
	}
	
  	//가장 작은 사람의 경우, 본인을 제외한 나머지 사람들이 모두 자기보다 큰 사람이므로
	//자기보다 키가 큰 사람이 왼쪽에 n명 있다는 말은, 다시 말해 본인이 n + 1번째 위치해 있다는 말이다
	
	for (int i = 0; i < n; i++)  //키가 가장 작은 사람부터 n + 1번째 위치를 연산하면 된다
	{
		idx = 0;
		cnt = -1;

		while (cnt != order[i])
		{
			if (line[idx] == 0)  //line[idx]가 비어있으면 칸을 세고, 비어있지 않으면 넘긴다
			{
				cnt++;
			}

			idx++;
		}

		line[idx - 1] = i + 1;
	}

	for (int i = 0; i < n; i++)
	{
		cout << line[i] << " ";
	}
	cout << endl;

	return 0;
}

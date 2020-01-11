#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> ans;
	int score, n, x;
	int total = 0;  //전체 점수

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x;
		ans.push_back(x);
	}

	score = 0;  //각 문제의 점수 : 누적된 점수

	for (int i = 0; i < n; i++)
	{
		if (ans[i] == 0)  //틀렸으면 score를 0으로 변경
		{
			score = 0;
		}
		else  //맞췄으면 score 증가
		{
			score++;
		}

		total += score;
	}

	cout << total << endl;

	return 0;
}

#include <iostream>

using namespace std;

int main()
{
	int num;
	int cnt = 1;
	int max = 2;
	int add = 6;

	cin >> num;

	while (max <= num)
	{
		max += add;
		add += 6;
		cnt++;
	}

	cout << cnt << "\n";

	return 0;
}

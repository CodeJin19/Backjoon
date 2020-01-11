#include <iostream>

using namespace std;

int main()
{
	int n;
	int sum = 0;

	cin >> n;

	while (0 < n)  //결국 n을 2진수로 바꿨을 때, 1의 갯수이므로 이를 세면 된다
	{
		sum += n % 2;
		n /= 2;
	}

	cout << sum << endl;

	return 0;
}

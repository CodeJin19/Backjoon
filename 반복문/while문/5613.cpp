#include <iostream>

using namespace std;

int main()
{
	int x, ans;
	char sym;

	cin >> ans >> sym;

	while (sym != '=')
	{
		cin >> x;

		switch (sym)
		{
		case '+':
			ans += x;
			break;
		case '-':
			ans -= x;
			break;
		case '*':
			ans *= x;
			break;
		case '/':
			ans /= x;
			break;
		}

		cin >> sym;
	}

	cout << ans << endl;

	return 0;
}

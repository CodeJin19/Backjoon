#include <iostream>

using namespace std;

int main()
{
	int s1, s2, ans, guess;
	bool flag = false;

	cin >> s1 >> s2;

	for (int i = 0; i < s1; i++)
	{
		cin >> ans >> guess;

		if (ans != guess)
		{
			flag = true;
			break;
		}
	}

	if (flag)
	{
		cout << "Wrong Answer\n";
	}
	else
	{
		for (int i = 0; i < s2; i++)
		{
			cin >> ans >> guess;

			if (ans != guess)
			{
				flag = true;
				break;
			}
		}

		if (flag)
		{
			cout << "Why Wrong!!!\n";
		}
		else
		{
			cout << "Accepted\n";
		}
	}

	return 0;
}

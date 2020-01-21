#include <iostream>
#include <string>

using namespace std;

int main()
{
	string num;
	int t;
	bool carry;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> num;

		carry = false;

		for (int i = num.length() - 1; 0 < i; i--)
		{
			if ('5' <= num[i])
			{
				num[i] = '0';
				carry = true;
			}
			else if (num[i] == '4' && carry)
			{
				num[i] = '0';
				carry = true;
			}
			else
			{
				num[i] = '0';
				carry = false;
			}
		}

		if (carry)
		{
			if (num[0] == '9')
			{
				num[0] = '0';
				cout << "1";
			}
			else
			{
				num[0] += 1;
			}
		}

		cout << num << "\n";
	}

	return 0;
}

#include <iostream>
#include <string>

using namespace std;

int main()
{
	int n, num, digit;
	string s;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> s;
		digit = 1;
		num = 0;

		for (int idx = s.length() - 1; 0 <= idx; idx--)
		{
			if (s[idx] == '1')
			{
				num += digit;
			}

			digit *= 2;
		}

		cout << num << endl;
	}

	return 0;
}

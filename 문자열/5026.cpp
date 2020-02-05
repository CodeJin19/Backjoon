#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	int t, a, b, idx, x;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> s;

		if(s[1] == '=')
		{
			cout << "skipped\n";
		}
		else
		{
			a = 0;
			b = 0;
			idx = 0;

			while (s[idx] != '+')
			{
				x = s[idx] - '0';
				a += x;
				a *= 10;

				idx++;
			}

			a /= 10;
			idx++;

			while (idx < s.length())
			{
				x = s[idx] - '0';
				b += x;
				b *= 10;

				idx++;
			}

			b /= 10;

			cout << a + b << "\n";
		}
	}
	return 0;
}

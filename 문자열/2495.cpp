#include <iostream>
#include <string>

using namespace std;

int main()
{
	string s;
	char x;
	int max, idx, off;

	for (int i = 0; i < 3; i++)
	{
		cin >> s;

		max = 0;
		idx = 0;
		
		for (; idx < 8;)
		{
			x = s[idx];
			off = 0;

			while (idx + off < 8 && s[idx + off] == x)
			{
				off++;
			}

			if (max < off)
			{
				max = off;
			}

			idx += off;
		}

		cout << max << endl;
	}

	return 0;
}

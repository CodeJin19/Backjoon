#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int n, num, len, obj, cut;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> num;

		len = log10(num);
		len++;

		cut = pow(10, len);

		obj = num * num;

		if (num == obj % cut)
		{
			cout << "YES\n";
		}
		else
		{
			cout << "NO\n";
		}

	}

	return 0;
}
